package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * Write a program that reads strings from the user.
 * If the input is empty, the program stops reading
 * input and halts. For each non-empty input it splits
 * the string input by whitespaces and prints each
 * part of the string on a new line.
 *
 */

public class lineByLine {

    // main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {

            // no input prompt
            String userInput = reader.nextLine();

            // since we want program to halt, not end, we use continue here!
            if (userInput.equals("")) {

                continue;

            }

            // create array for each line of input
            String[] lineOfText = userInput.split(" ");

            for (String word : lineOfText) {

                System.out.println(word);

            }

        }

    }

}
