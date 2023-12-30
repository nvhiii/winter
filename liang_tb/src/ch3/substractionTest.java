package ch3;

import java.util.Scanner;

/**
 * This will utilize if-else + math.random
 */
public class substractionTest {

    public static void main(String[] args) {

        int num1, num2, difference, userAnswer;

        // first we will randomly generate 2 numbers

        num1 = (int) (Math.random() * 10); // round to 2 digits
        num2 = (int) (Math.random() * 10); // round to 2 digits

        Scanner scanner = new Scanner(System.in);

        if (num1 > num2) {

            difference = num1 - num2;
            System.out.println("What is " + num1 + " - " + num2);

        } else {

            difference = num2 - num1;
            System.out.println("What is " + num2 + " - " + num1);

        }

        System.out.println("Enter your answer below: ");
        userAnswer = Integer.valueOf(scanner.nextLine());

        if (userAnswer == difference) {

            System.out.println("Congrats! Your answer is CORRECT.");

        } else {

            System.out.println("Sorry. Your answer is INCORRECT.");

        }

    }

}
