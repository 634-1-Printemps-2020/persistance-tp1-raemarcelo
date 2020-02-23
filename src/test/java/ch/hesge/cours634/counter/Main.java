import ch.hesge.cours634.counter.Counter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Counter c = new Counter();
        c.add(1);
        System.out.println(c.getValue());
        c.inc();
        System.out.println(c.getValue());
    }
}
