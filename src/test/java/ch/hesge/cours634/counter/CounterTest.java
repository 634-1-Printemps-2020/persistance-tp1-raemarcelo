package ch.hesge.cours634.counter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

//    @AfterEach
//    void tearDown() {
//    }

    @Test
    void inc() throws CounterException {
        Counter counter = new Counter();
        counter.inc();
        assertEquals(1, counter.getValue());
    }

    @Test
    void add() {
    }

    @Test
    void getValue() {
    }
}