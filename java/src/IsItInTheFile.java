// import(s)
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

/**
 * The exercise template comes with two files, names.txt and other-names.txt.
 * Write a program that first asks the user for the name of the file to be read,
 * after which the user is prompted for the string that they're looking for.
 * The program then reads the file and searches for the desired string.
 *
 * If the string is found, the program should print "Found!".
 * If not, the program should print "Not found.".
 * If reading the file fails (the reading ends in an error) the program should print the message
 * "Reading the file " + file + " failed.".
 */

public class IsItInTheFile {

    // main method
    public static void main(String[] args) {

        // declare arraylist
        ArrayList<String> names = new ArrayList<>();
        // user input scanner
        Scanner reader = new Scanner(System.in);

        // prompt for file name, this program only checks one file per iteration
        System.out.println("Name of the file: ");
        String inputFileName = reader.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(inputFileName))) {

            // while-loop to populate arraylist first
            while (scanner.hasNextLine()) {

                names.add(scanner.nextLine());

            }

            // while-loop to check user input
            while (true) {

                // read in
                System.out.println("Search for: ");
                String searchFor = reader.nextLine();

                // break cond
                if (searchFor.isEmpty()) {

                    System.out.printf("Empty user string entered. Now terminating.");
                    break;

                }

                // handle valid input
                if (names.contains(searchFor)) {

                    System.out.printf("Found!");

                } else {

                    System.out.println("Not found.");

                }

            }

        } catch (Exception e) {

            System.out.println("Reading the file " + inputFileName + " failed.");

        }

    }

}
