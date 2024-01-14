

public class DCMain {

    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.reset();
        counter.printValue();

        /*
        Expected output:

            value: 10
            value: 9
            value: 8

         */

    }

}
