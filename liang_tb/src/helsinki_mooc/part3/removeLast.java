package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create the method
 * public static void removeLast(ArrayList<String> strings)
 * in the exercise template. The method should remove the
 * last value in the list it receives as a parameter.
 * If the list is empty, the method does nothing.
 *
 */
public class removeLast {

    // main method
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        // populate list
        while (true) {

            String userString = reader.nextLine();

            if (userString.equals("")) {

                System.out.println("Empty string detected. Now terminating.");
                break;

            }

            stringList.add(userString);

        }

        // method call
        removeLast(stringList);

    }

    // removeLast method
    public static void removeLast(ArrayList<String> strings) {

        if (strings.size() == 0) {

            return;

        }

        // invoke remove method
        strings.remove(strings.size() - 1);

    }



}
