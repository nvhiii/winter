package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *The exercise template contains a base that reads
 * numbers from the user and adds them to a list.
 * Reading is stopped once the user enters the number -1.
 *
 * Modify the program so that after reading the
 * numbers it calculates and prints the sum of the
 * numbers in the list.
 *
 */
public class sumListForEach {


    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {

            int userNum = Integer.valueOf(reader.nextLine());

            if (userNum == -1) {

                System.out.println("Input -1 detected. Terminating.");
                break;

            }

            numList.add(userNum);

        }

        int sum = 0;
        for (int num : numList) {

            sum += num;

        }

        System.out.println("Sum: " + sum);

    }
}
