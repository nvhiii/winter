package helsinki_mooc.part3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * In the exercise template there is a program
 * that reads inputs from the user and adds them
 * to a list. Reading is stopped once the user
 * enters an empty string.
 *
 * Modify the program to print both the first and
 * the last values after the reading ends. You may
 * suppose that at least two values are read into
 * the list.
 */
public class firstAndLast {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {

            String name = reader.nextLine();

            if (name.equals("")) {

                System.out.println("Empty string entered. Terminating.");
                break;

            }

            nameList.add(name);

        }

        System.out.println("First number of the list: " + nameList.get(0));
        System.out.println("Last number of the list: " + nameList.get(nameList.size()-1));

    }

}
