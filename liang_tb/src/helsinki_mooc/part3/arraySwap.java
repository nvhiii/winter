package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * The exercise template already contains a program,
 * that creates an array and prints the values of the
 * array twice. Modify the program to do following:
 * After the first printing, the program should ask for
 * two indices from the user. The values in these two
 * indices should be swapped, and in the end the values
 * of the array should be printed once again.
 *
 */

public class arraySwap {

    // main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // declare array of length 5
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }
        System.out.println(); // empty line

        System.out.println("Give two indices to swap: ");
        int index1 = Integer.valueOf(reader.nextLine());
        int index2 = Integer.valueOf(reader.nextLine());

        System.out.println(); // empty line

        // temp var to hold val of numbers[index1]
        int temp = numbers[index1];

        // values of indexes are swapped
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }

    }

}
