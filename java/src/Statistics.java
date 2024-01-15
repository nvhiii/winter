public class Statistics {

    /*
        Part 1
        Count
        Create a class Statistics that has the following functionality
        (the file for the class is provided in the exercise template):

        a method addNumber adds a new number to the statistics
        a method getCount tells the number of added numbers
        The class does not need to store the added numbers anywhere,
        it is enough for it to remember their count. At this stage,
        the addNumber method can even neglect the numbers being added to the statistics,
        since the only thing being stored is the count of numbers added.
    */

    // instance variable(s)
    // encapsulation
    private int count;
    private int sum;

    // constructor
    public Statistics() {

        this.count = 0;
        this.sum = 0;

    }

    public void addNumber(int number) {

        this.sum += number;
        this.count++;

    }

    public int getCount() {

        return this.count;

    }

    /*
        Expand the class with the following functionality:

        the sum method tells the sum of the numbers added
        (the sum of an empty number statistics object is 0)

        the average method tells the average of the numbers added
        (the average of an empty number statistics object is 0

    */

    public int sum() {

        return this.sum;

    }

    public double average() {

        return (double) this.sum / this.count;

    }

    /*

        Write a program that asks the user
        for numbers until the user enters -1.
        The program will then provide the sum
        of the numbers.

        The program should use a Statistics
        object to calculate the sum.

        NOTE: Do not modify the Statistics class
        in this part. Instead, implement the program
        for calculating the sum by making use of it.

    */



}
