package helsinki_mooc.part1;

import java.util.Scanner;
public class giftTax {

    public static void main(String[] args) {

        double taxTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of gift? ");
        int val = Integer.valueOf(scanner.nextLine());

        if (val < 5000) {

            System.out.println("No gift tax");

        } else if (val >= 5000 || val < 25000) {

            taxTotal = 100 + (val - 5000) * 0.08;
            System.out.println("Tax: " + taxTotal);

        } else if (val >= 25000 || val < 55000) {

            taxTotal = 1700 + (val - 25000) * 0.1;
            System.out.println("Tax: " + taxTotal);

        } else if (val >= 55000 || val < 200000) {

            taxTotal = 4700 + (val - 55000) * 0.12;
            System.out.printf("Tax: " + taxTotal);

        } else if (val >= 200000 || val < 1000000) {

            taxTotal = 22100 + (val - 200000) * 0.15;
            System.out.println("Tax: " + taxTotal);

        } else if (val >= 1000000) {

            taxTotal = 142100 + (val - 1000000) * 0.17;
            System.out.println("Tax: " + taxTotal);

        } else {

            System.out.println("Invalid amount!");

        }

    }

}
