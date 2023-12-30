package helsinki_mooc.part2;

import java.util.Scanner;

/**
 * Write a program that reads values from the user until they input a 0.
 * After this, the program prints the total number of inputted values.
 * The zero that's used to exit the loop should not be included in
 * the total number count.
 */

public class numCounter {

    public static void main(String[] args) {

        int count = 0; // initialize the thing
        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number: ");
            int inputNum = Integer.valueOf(reader.nextLine());

            if (inputNum == 0) {

                break;

            }

            count++;

        }

        System.out.println("Number of numbers: " + count);

    }

}
