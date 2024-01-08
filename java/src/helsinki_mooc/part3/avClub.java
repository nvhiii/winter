package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * Write a program that reads user input until an empty line.
 * For each non-empty string, the program splits the string
 * by spaces " " and then prints the pieces that contain av,
 * each on a new line.
 */

public class avClub {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {

            // no input prompt, just scanner var
            String userInput = reader.nextLine();

            // since we want to end the program after empty, break cond
            if (userInput.equals("")) {

                System.out.println("Empty string entered, now terminating.");
                break;

            }

            // create string array for each input string by delimiter " "
            String[] splitString = userInput.split(" ");

            // logic for checking each string in array with "av" anywhere
            for (String word : splitString) {

                if (word.contains("av")) {

                    System.out.println(word);

                }

            }

        }

    }

}
