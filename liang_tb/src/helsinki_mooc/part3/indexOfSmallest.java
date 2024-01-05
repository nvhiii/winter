package helsinki_mooc.part3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads numbers from the user.
 * When number 9999 is entered, the reading process stops.
 * After this the program will print the smallest number in the list,
 * and also the indices where that number is found.
 *
 * Notice: the smallest number can appear multiple times in the list.
 *
 * Hint: combine the programs you wrote for the exercises
 * "Greatest number in the list" and "Index of the requested number".
 * First find the smallest number, and then find the index of that number.
 *
 */
public class indexOfSmallest {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            // read in
            int userNum = Integer.valueOf(reader.nextLine());

            // break cond
            if (userNum == 9999) {

                System.out.println("Number 9999 is entered, reading process stopping.");
                break;

            }

            // handle valid input
            numList.add(userNum);

        }

        // initialize val for comparison for smallest in list
        int smallest = numList.get(0);
        for (int i = 0; i < numList.size(); i++) {

            int num = numList.get(i);
            // if num is smaller than current smallest value, it will be given a new value
            if (num < smallest) {

                smallest = num;

            }

        }
        // print out smallest num in list
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numList.size(); i++) {

            if (numList.get(i) == smallest) {

                // print out index of smallest in list
                System.out.println("Found at index: " + i);

            }

        }

    }

}
