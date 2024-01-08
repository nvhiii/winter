package helsinki_mooc.part2;

import java.util.Scanner;

/**
 * Write a program that asks the user for numbers.
 * If the number is negative (smaller than zero),
 * the program prints for user "Unsuitable number"
 * and asks the user for a new number. If the number is zero,
 * the program exits the loop. If the number is positive,
 * the program prints the number to the power of two.
 */
public class positiveSquare {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.println("Give a number: ");
            int inputNum = Integer.valueOf(reader.nextLine());

            if (inputNum < 0) {

                System.out.println("Unsuitable number. Please enter a new number.");
                continue;

            } else if (inputNum == 0) {

                break;

            } else {

                int squaredNum = inputNum * inputNum;
                System.out.println(squaredNum);

            }

        }

    }

}
