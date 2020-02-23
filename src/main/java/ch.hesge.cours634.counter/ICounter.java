package ch.hesge.cours634.counter;

public interface ICounter {
    <CounterException extends Throwable> void inc() throws CounterException;

    <CounterException extends Throwable> void add(int step) throws CounterException;

    int getValue();
}
