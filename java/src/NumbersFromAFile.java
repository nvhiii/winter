// import(s)
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

/**
 * Write a program that prompts the user for a filename,
 * as well as the upper and lower bounds for the accepted range
 * of numbers. Then the program reads the numbers contained in
 * the file (each number is on its own line) and only accounts
 * for the numbers which are inside the given range. Finally,
 * the program should print the number of numbers that were inside
 * the given range.
 *
 * You can convert a string-type integer read from a file into a
 * proper integer using the command Integer.valueOf (just as when
 * handling input from a user).
 */

public class NumbersFromAFile {

    // main method
    public static void main(String[] args) {

        // declare arraylist
        ArrayList<Integer> nums = new ArrayList<>();
        // scanner
        Scanner reader = new Scanner(System.in);
        int inRange = 0;

        // prompt user for file name
        System.out.print("File? ");
        String fileName = reader.nextLine();

        // prompt user for lower bound as int
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(reader.nextLine());

        // prompt user for upper bound as int
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(reader.nextLine());

        // now read file contents via path
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            // add contents of file in arraylist
            while (scanner.hasNextLine()) {

                int num = Integer.valueOf(scanner.nextLine());
                nums.add(num);

            }

            // comparison for each loop
            for (int number : nums) {

                if (number >= lowerBound && number <= upperBound) {

                    inRange++;

                }

            }


        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Numbers: " + inRange);

    }

}
