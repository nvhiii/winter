package helsinki_mooc.part3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create the method
 * public static int sum(ArrayList<Integer> numbers)
 * in the exercise template. The method is to return
 * the sum of the numbers in the parameter list.
 */
public class sumMethod {

    // main method
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        // populate arraylist
        while (true) {

            int userNum = Integer.valueOf(reader.nextLine());

            if (userNum == 0) {

                System.out.println("Input of 0 detected. Now terminating.");
                break;

            }

            numList.add(userNum);

        }

        System.out.println(sum(numList));

    }

    // sum method
    public static int sum(ArrayList<Integer> numbers) {

        if (numbers.size() == 0) { // won't use isEmpty, didnt learn method

            return -1;

        }

        int sum = 0;
        for (int num : numbers) {

            sum += num;

        }

        return sum;

    }

}
