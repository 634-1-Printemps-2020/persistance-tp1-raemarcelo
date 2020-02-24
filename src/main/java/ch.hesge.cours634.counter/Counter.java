package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int val;

    public Counter() {
    }

    public Counter(int val) {
        this.val = val;
    }

    @Override
    public void inc() throws CounterException {
        val++;
    }

    @Override
    public void add(int step) throws CounterException {
        val=val+step;
    }

    @Override
    public int getValue() {
        return val;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "val=" + val +
                '}';
    }

    public void setVal(int val) {
        this.val = val;
    }
}
