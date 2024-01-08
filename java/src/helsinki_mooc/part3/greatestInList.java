package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template contains a base that reads
 * numbers from the user and adds them to a list. Reading
 * is stopped once the user enters the number -1.
 *
 * Continue developing the program so that it finds
 * the greatest number in the list and prints its value
 * after reading all the numbers. The programming should
 * work in the following manner.
 *
 */

public class greatestInList {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            // read
            int userInput = Integer.valueOf(reader.nextLine());
            // break cond
            if (userInput == -1) {

                System.out.println("The number -1 detected. Now terminating.");
                break;

            }

            // handle valid input
            numList.add(userInput);

        }

        // i want to use only one loop, would be more efficient, frustrating.

        // initialize var for comparison
        int max = numList.get(0);
        for (int i = 0; i < numList.size(); i++) {
            // create var to compare to max, to use in bool cond
            int num = numList.get(i);

            if (num > max) {

                max = num;

            }

        }

        System.out.println("The largest number in the list is: " + max);


    }

}
