/**
 * Create a class Multiplier that has a:
 *
 * Constructor public Multiplier(int number).
 * Method public int multiply(int number) which
 * returns the value number passed to it multiplied
 * by the number provided to the constructor.
 *
 * You also need to create an instance variable in this exercise.
 */
public class Multiplier {

    // instance variable
    // using keyword private = encapsulation
    private int number;

    // constructor
    public Multiplier(int number) {

        this.number = number;

    }

    public int multiply(int number) {

        return this.number *= number;

    }

}
