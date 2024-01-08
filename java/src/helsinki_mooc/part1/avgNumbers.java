package ch1;

import java.util.Scanner;
public class avgNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many numbers you would like to find avg of: ");
        int numOfNums = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < numOfNums; i++) {

            int num = Integer.valueOf(scanner.nextLine());
            sum += num;

        }

        double avg = 1.0 * sum / numOfNums;

        System.out.println("The average of " + numOfNums + " numbers is " + avg);

    }

}
