public class ClockHand {

    // instance var
    private int limit; // value for max limit
    private int value; // value to be updated

    // constructor
    public ClockHand(int initLimit) {

        this.limit = initLimit;
        this.value = 0;

    }

    // advance value method
    public void advance() {

        this.value++;

        if (this.value >= this.limit) {

            this.value = 0;

        }

    }

    // getter for value
    public int getValue() {

        return this.value;

    }

    @Override
    public String toString() {

        if (this.value < 10) {

            return "0" + this.value;

        }

        return "" + this.value;

    }

}
