package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * My own implementation of splitting input from csv, print 1st and last inputs
 */
public class firstAndLastWords {

    // main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {

            // read in
            String userInput = reader.nextLine();

            // break cond
            if (userInput.equals("")) {

                System.out.println("Detected empty string input, now terminating");
                break;

            }

            // handle valid input
            // split each csv line via delimiter, into array
            String[] inputArray = userInput.split(",");

            System.out.println("First part of this split csv line: " + inputArray[0]);
            System.out.println("Last part of this split csv line: " + inputArray[inputArray.length-1]);

        }

    }

}
