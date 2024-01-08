package helsinki_mooc.part2;

import java.util.Scanner;

/**
 * p1: Write a program which prints the integers from 1 to a number given by the user.
 *
 * p2: Ask the user for the starting point as well.
 *
 */
public class toAndFrom {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int whereTo = Integer.valueOf(reader.nextLine()); // value to which we want to go to
        int whereFrom = Integer.valueOf(reader.nextLine()); // value of which we want to start from

        if (whereTo < whereFrom) {

            System.out.println("Cannot traverse backwards, sorry.");

        } else {

            for (int i = whereFrom; i <= whereTo; i++) { // implement logic for both

                System.out.println(i);

            }

        }


    }

}
