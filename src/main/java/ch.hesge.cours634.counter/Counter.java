package ch.hesge.cours634.counter;

public class Counter implements ICounter {


    int v;
    int max;

    @Override
    public <CounterException extends Throwable> void inc() throws CounterException {
        v = v + 1;
    }

    @Override
    public <CounterException extends Throwable> void add(int step) throws CounterException {
        v = step;
    }

    @Override
    public int getValue() {
        return v;
    }
}
