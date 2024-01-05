package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Editing the task at hand to a personal challenge.
 *
 * Use scanner library to read in values of arraylist until empty string.
 * Then, prompt user to check for a specific string value.
 * If found, print "[User input] was found!, then remove it"
 * Else, add to list.
 *
 * After, remove from list.
 *
 */
public class onTheListRemove {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        // populate arraylist
        while (true) {

            String name = reader.nextLine();

            if (name.equals("")) {

                System.out.println("Empty string input. Now terminating.");
                break;

            }

            names.add(name);

        }

        System.out.println("Search for? ");
        String searchFor = reader.nextLine();

        boolean exists = names.contains(searchFor);
        if (exists) {

            System.out.println(searchFor + " was found!");
            names.remove(searchFor);

        } else {

            names.add(searchFor);

        }

    }

}
