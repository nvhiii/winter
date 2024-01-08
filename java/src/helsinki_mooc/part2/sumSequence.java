package helsinki_mooc.part2;

import java.util.Scanner;

/**
 * Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
 *
 * Implement a program which calculates the sum of a closed interval, and prints it.
 * Expect the user to write the smaller number first and then the larger number.
 */

public class sumSequence {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("First number? ");
        int firstNum = Integer.valueOf(reader.nextLine());

        System.out.println("Second number? ");
        int lastNum = Integer.valueOf(reader.nextLine());
        int sum = 0;

        for (int i = firstNum; i <= lastNum; i++) {

            sum += i;

        }

        System.out.println("The sum is: " + sum);


    }

}
