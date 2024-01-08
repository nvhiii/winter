package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template contains a base that reads
 * numbers from the user and adds them to a list. Reading
 * is stopped once the user enters the number -1.
 *
 * Expand the program to ask for a start and end indices once
 * it has finished asking for numbers. After this the program
 * shall prints all the numbers in the list that fall in the
 * specified range (between the indices given by the user, inclusive).
 * You may assume that the user gives indices that match some numbers in the list.
 */

public class onlyTheseNumbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {

            int num = Integer.valueOf(reader.nextLine());

            if (num == -1) {

                System.out.println("Value of -1 detected. Now terminating.");

                System.out.println("From where? ");
                int startIndex = Integer.valueOf(reader.nextLine());

                System.out.println("To where? ");
                int endIndex = Integer.valueOf(reader.nextLine());

                for (int i = startIndex; i <= endIndex; i++) {

                    System.out.println(numList.get(i));

                }

                break;

            }

            numList.add(num);

        }

    }

}
