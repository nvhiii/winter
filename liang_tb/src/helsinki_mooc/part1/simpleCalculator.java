package ch1;

import java.util.Scanner;
public class simpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers you wish to do the 3 operations on.");
        int numOfNums = Integer.valueOf(scanner.nextLine());

        // solves sum of n nums, diff of n nums,
        int sum = 0, difference = 0, product = 1;
        for (int i = 0; i < numOfNums; i++) {

            int num = Integer.valueOf(scanner.nextLine());
            sum += num;

            if (i == 0) {

                difference = num;

            } else {

                difference -= num;

            }

            product *= num;

        }

        System.out.println("The sum of your " + numOfNums + " numbers is " + sum);
        System.out.println("The difference of your " + numOfNums + " numbers is " + difference);
        System.out.println("The product of your " + numOfNums + " numbers is " + product);


    }

}
