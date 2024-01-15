import java.util.Scanner;

public class StatisticsMain {

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

    // main method
    public static void main(String[] args) {

        // scanner var
        Scanner reader = new Scanner(System.in);

        // instantiation of 3 statistics objects

        // calculates sum of all num
        Statistics newStats = new Statistics();

        // calculates sum of even numbers
        Statistics newStats1 = new Statistics();

        // calculate sum of odd numbers
        Statistics newStats2 = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {

            // read in
            int userNum = Integer.valueOf(reader.nextLine());

            // break cond
            if (userNum == -1) {

                System.out.println("Input -1 detected. Now terminating.");
                break;

            }

            // handle valid input
            newStats.addNumber(userNum);

            // add userNum to even or odd object per iteration
            if (userNum % 2 == 0) {

                newStats1.addNumber(userNum);

            } else {

                newStats2.addNumber(userNum);

            }

        }

        System.out.println("Sum: " + newStats.sum());
        System.out.println("Sum of even numbers: " + newStats1.sum());
        System.out.println("Sum of odd numbers: " + newStats2.sum());

    }

}
