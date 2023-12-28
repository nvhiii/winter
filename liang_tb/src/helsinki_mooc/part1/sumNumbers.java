package ch1;

import java.util.Scanner;
public class sumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers you wish to add");
        int numOfNums = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < numOfNums; i++) {

            int num = Integer.valueOf(scanner.nextLine());
            sum += num;

        }

        System.out.println("The sum of the numbers is " + sum);

    }

}
