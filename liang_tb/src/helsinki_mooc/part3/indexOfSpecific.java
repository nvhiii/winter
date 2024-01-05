package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template contains a base that
 * reads numbers from the user and adds them to
 * a list. Reading is stopped once the user
 * enters the number -1.
 *
 * Expand the program by adding a functionality that
 * asks the user for a number, and reports that number's
 * index in the list. If the number is not found, the
 * rogram should not print anything.
 *
 */
public class indexOfSpecific {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            // read
            int userInput = Integer.valueOf(reader.nextLine());
            // break cond
            if (userInput == -1) {

                System.out.println("Reading is stopped since -1 input was detected.");
                break;

            }
            // handle valid input
            numList.add(userInput);

        }

        // prompt after input for arraylist done
        System.out.println("Search for? ");
        int searchFor = Integer.valueOf(reader.nextLine());

        for (int i = 0; i < numList.size(); i++) {

            if (numList.get(i) == searchFor) {

                System.out.println(searchFor + " is at index " + i);

            }

        }

    }

}
