// import(s)
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

/**
 * The exercise template comes ready with functionality for
 * the guest list application. It checks whether names entered
 * by the user are on the guest list.
 *
 * However, the program is missing the functionality needed
 * for reading the guest list. Modify the program so that the
 * names on the guest list are read from the file.
 */

public class GuestListFromFile {

    public static void main(String[] args) {

        // arraylist
        ArrayList<String> guestList = new ArrayList<>();
        // scanner
        Scanner reader = new Scanner(System.in);

        // prompt [filename].[extension]
        System.out.println("Name of the file: ");
        String fileName = reader.nextLine();

        // prompt
        System.out.println("Enter names, an empty line quits");
        // try-catch block for reading file contents
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {

                guestList.add(scanner.nextLine());

            }

            while (true) {

                // read in
                String userInput = reader.nextLine();

                // break cond
                if (userInput.isEmpty()) {

                    System.out.println("Empty input entered. Now terminating.");
                    break;

                }

                // handle valid input -- in this scenario, comparison happens
                if (guestList.contains(userInput)) {

                    System.out.println("The name is on the list.");

                } else {

                    System.out.println("The name is not on the list.");

                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Thank you!");

    }

}
