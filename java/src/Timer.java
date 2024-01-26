public class Timer {

    // instance variables
    private ClockHand hundredthsHand;
    private ClockHand secondsHand;

    // constructor that initializes clockhand objects
    public Timer() {

        this.hundredthsHand = new ClockHand(100);
        this.secondsHand = new ClockHand(60);

    }

    @Override
    public String toString() {

        return secondsHand + " seconds, " + hundredthsHand + " hundredths of a second.";

    }

    public void advance() {

        this.hundredthsHand.advance();

        if (hundredthsHand.getValue() == 0) {

            secondsHand.advance();

        }


    }

}
