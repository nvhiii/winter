package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * The exercise template already has an array
 * containing numbers. Complete the program so
 * that it asks the user for a number to search in
 * the array. If the array contains the given number,
 * the program tells the index containing the number.
 * If the array doesn't contain the given number,
 * the program will advise that the number wasn't found.
 *
 */

public class indexNotFound {

    public static void main(String[] args) {

        // Scanner var
        Scanner reader = new Scanner(System.in);

        // initialize array of length 5
        int[] nums = new int[5];

        // populate array
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        System.out.println("Array is already initialized. Please search for a specific number: ");
        int userNum = Integer.valueOf(reader.nextLine());

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == userNum) {

                System.out.println(userNum + " is at index " + i);
                found = true;
                break;

            }

        }

        if (!found) {

            System.out.println(userNum + " was not found.");

        }

    }

}
