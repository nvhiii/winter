package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template contains a base that
 * reads numbers from the user and adds them to a list.
 * Reading is stopped once the user enters the number -1.
 *
 * Expand the functionality of the program so that
 * after reading the numbers, it prints all the numbers
 * received from the user. The number used to indicate
 * stopping should not be printed.
 *
 */

public class rememberNumbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {

            int userNum = Integer.valueOf(reader.nextLine());

            if (userNum == -1) {

                System.out.println("Input of -1 detected. Now terminating.");

                for (int i = 0; i < numList.size(); i++) {

                    System.out.println(numList.get(i));

                }

                break;

            }

            numList.add(userNum);

        }


    }

}
