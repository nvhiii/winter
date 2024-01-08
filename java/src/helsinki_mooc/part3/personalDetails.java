package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * Write a program that reads names and birth
 * years from the user until an empty line is entered.
 * The name and birth year are separated by a comma.
 *
 * After that the program prints the longest name
 * and the average of the birth years. If multiple names
 * are equally longest, you can print any of them.
 * You can assume that the user enters at least one person.
 */

public class personalDetails {

    // main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // setting scope variables
        String longestName = "";
        int sum = 0, count = 0;

        while (true) {

            // read in
            String userInput = reader.nextLine();

            if (userInput.equals("")) {

                System.out.println("Empty string input, now terminating.");
                break;

            }

            // split input via delimiter into array
            String[] splitString = userInput.split(",");

            // logic to return longest name for all input until break
            if (splitString[0].length() > longestName.length()) {

                longestName = splitString[0];

            }

            // logic to calculate avg of ages
            sum += Integer.valueOf(splitString[1]);
            count++;

        }

        double avg = 1.0 *  sum / count;

        // print stmnts
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);

    }

}
