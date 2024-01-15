// imports
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * In the exercise template there is a ready-made class
 * TelevisionProgram, representing a television program.
 * The class has object variables name and duration, a
 * constructor, and a few methods.
 *
 * Implement a program that begins by reading television
 * programs from the user. When the user inputs an empty
 * string as the name of the program, the program stops
 * reading programs.
 *
 * After this the user is queried for a maximum duration.
 * Once the maximum is given, the program proceeds to list
 * all the programs whose duration is smaller or equal to
 * the specified maximum duration.
 */

public class TelevisionPrograms {

    // main method
    public static void main(String[] args) {

        // scanner
        Scanner reader = new Scanner(System.in);
        // declare arraylist for tv programs
        ArrayList<TelevisionProgram> tv = new ArrayList<>();

        while (true) {

            // implement only one scanner var
            // read in
            System.out.print("Name: ");
            String name = reader.nextLine();

            // break cond
            if (name.isEmpty()) {

                System.out.println("Empty input. Now terminating program");
                break;

            }

            // continue read in
            System.out.print("Duration: ");
            int duration = Integer.valueOf(reader.nextLine());

            // handle valid input, add to arraylist
            tv.add(new TelevisionProgram(name, duration));

        }

        System.out.println();
        System.out.print("Program's maximum duration? ");
        int time = Integer.valueOf(reader.nextLine());

        for (TelevisionProgram program : tv) {

            if (program.getDuration() <= time) {

                System.out.println(program);

            }

        }

    }

}
