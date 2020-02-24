package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int init, int max) {
        super(init);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        checkMax(getValue() + 1 > max, "Counter cannot exceed max value: " + max);

        super.inc();
    }

    @Override
    public void add(int step) throws CounterException {
        checkMax(getValue() + step > max, "Counter cannot exceed max value: " + max);

        checkMax(getValue() + step < 0, "Counter cannot be negative: ");

        super.add(step);
    }

    private void checkMax(boolean b, String s) throws CounterException {
        if (b) {
            throw new CounterException(s);
        }
    }

    @Override
    public String toString() {
        return "UpperLimitedPositiveCounter{" +
                "value=" + getValue() +
                "max=" + max +
                '}';
    }
}
