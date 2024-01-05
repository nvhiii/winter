package helsinki_mooc.part3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * In the exercise template there is a program that
 * reads integers from the user and adds them to a list.
 * This ends when the user enters 0. The program then
 * prints the first value on the list.
 *
 * Modify the program so that instead of the first value,
 * the program prints the sum of the second and third numbers.
 * The program is allowed to malfunction if there are fewer than
 * three entries on the list, so you don't need to prepare
 * for such an event at all.
 *
 */

public class secondPlusThird {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> integerArray = new ArrayList<>();

        while (true) {

            int userInput = Integer.valueOf(reader.nextLine()); // read in

            if (userInput == 0) { // break cond

                System.out.println("Number 0 entered. Now terminating.");
                break;

            }

            // handle valid input
            integerArray.add(userInput);

        }

        int sumSecondThird = integerArray.get(1) + integerArray.get(2);
        System.out.println("The sum of the second and third elements are: " + sumSecondThird);

    }

}
