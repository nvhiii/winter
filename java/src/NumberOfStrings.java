// import(s)
import java.util.Scanner;

/**
 * Write a program that reads strings from the user until
 * the user inputs the string "end". At that point, the
 * program should print how many strings have been read.
 * The string "end" should not be included in the number
 * strings read. You can find some examples below of how
 * the program works.
 */
public class NumberOfStrings {

    public static void main(String[] args) {

        // scanner
        Scanner reader = new Scanner(System.in);

        int stringsRead = 0;

        while (true) {

            // read in
            String userString = reader.nextLine();

            // break cond
            if (userString.equals("end")) {

                System.out.println("String [end] was input. Now terminating");
                break;

            }

            stringsRead++;

        }

        System.out.println(stringsRead);

    }

}
