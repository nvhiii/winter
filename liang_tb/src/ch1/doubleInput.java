package ch1;

import java.util.Scanner;

public class doubleInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        double dNum = Double.valueOf(scanner.nextLine());
        // or can use double dNum = scanner.nextDouble();

        System.out.println("You gave the number: " + dNum);

    }

}
