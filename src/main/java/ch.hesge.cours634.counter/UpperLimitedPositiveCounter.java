package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {


    @Override
    public <CounterException extends Throwable> void inc() throws CounterException {

    }

    @Override
    public <CounterException extends Throwable> void add(int step) throws CounterException {

    }

    @Override
    public int getValue() {
        return 0;
    }
}
