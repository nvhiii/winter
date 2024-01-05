package helsinki_mooc.part3;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create the method
 * public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
 * in the exercise template. The method prints the
 * numbers in the given list whose values are in the range [lowerLimit, upperLimit].
 *
 */
public class printInRange {

    // main method
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        // populate arraylist
        while (true) {

            int userNum = Integer.valueOf(reader.nextLine());

            if (userNum == 0) {

                System.out.println("Input of 0 detected. Now terminating program.");
                break;

            }

            numList.add(userNum);

        }

        // method call to focus method of this exercise
        printNumbersInRange(numList, 0, 5);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        // this print is to print out before for loop, for the range specified
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");

        for (int num : numbers) {

            // as long as greater than or equal to lower and less than or equal to upper, print out num in list
            if (num <= upperLimit && num >= lowerLimit) {

                System.out.println(num);

            }

        }

    }

}
