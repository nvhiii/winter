package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * Given the format: name, age
 * And multiple lines of input,
 * Print the oldest age + name of oldest
 */

public class oldestAgeName {

    // main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // comparison var, setting scope
        int oldest = 0;
        String name = "";

        while (true) {

            // read in inputs
            String userInput = reader.nextLine();

            // break cond
            if (userInput.equals("")) {

                System.out.println("Empty string detected, now terminating");
                break;

            }

            // split each line of input into array, using delimiter
            String[] splitString = userInput.split(",");

            // now we have array of expected index 0 and 1, we want to compare each splitString[1]
            if (Integer.valueOf(splitString[1]) > oldest) {

                oldest = Integer.valueOf(splitString[1]);
                name = splitString[0];

            }

        }

        System.out.println("Name of the oldest: " + name);
        System.out.println("Age of the oldest: " + oldest);

    }

}
