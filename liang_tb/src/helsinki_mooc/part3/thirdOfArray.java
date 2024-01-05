package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise contains a base that asks the user for
 * strings and adds them to a list. The program stops
 * reading when the user enters an empty string.
 * The program then prints the first element of the list.
 *
 * Your assignment is to modify the program so that instead
 * of the first value, the third value on the list is printed.
 * Remember that programmers start counting from zero!
 * The program is allowed to malfunction if there are fewer
 * than three entries on the list, so you don't need to
 * prepare for such an event at all.
 */

public class thirdOfArray {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        while (true) {

            String userInput = reader.nextLine(); // read input

            if (userInput.equals("")) { // break cond

                System.out.println("Empty string entered, stopping read.");
                break;

            }

            // no need to handle for arrayList of size of 3 or less

            stringList.add(userInput); // handle valid input

        }

        System.out.println("The third element of this specific ArrayList is: " + stringList.get(2)); // starting from 0, 3rd is 2nd index

    }

}
