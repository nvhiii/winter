package helsinki_mooc.part4;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {

        // since void return, we don't need to return val
        if (value > 0) {

            this.value -= 1;

        }

    }
    // and the other methods go here
}
