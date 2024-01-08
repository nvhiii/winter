package ch2;

import java.util.Scanner;

/**
 * Purpose is to have two var, which equate to m * r^2
 */
public class mr2 {

    public static void main(String[] args) {

        int m, r;
        double product;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers for the m*(r^2) equation.");
        m = Integer.valueOf(scanner.nextLine());
        r = Integer.valueOf(scanner.nextLine());

        product = m * Math.pow(r, 2);

        System.out.println(product);

    }

}
