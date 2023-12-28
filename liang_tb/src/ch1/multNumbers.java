package ch1;

import java.util.Scanner;
public class multNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nums you wish to multiply.");
        int numOfNums = Integer.valueOf(scanner.nextLine());

        int product = 1;
        for (int i = 0; i < numOfNums; i++) {

            int num = Integer.valueOf(scanner.nextLine());
            product *= num;

        }

        System.out.println("The product of your factors are: " + product);

    }
}
