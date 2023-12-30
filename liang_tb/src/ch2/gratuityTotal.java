package ch2;

import java.util.Scanner;
/**
 * This is a demo of narrowing types via explicit casting, java auto widens types
 * given subtotal and gratuity percent, calculate total
 */
public class gratuityTotal {

    // small to large = widening type
    // large to small = narrowing type

    public static void main(String[] args) {

        int subtotal, gratuityRate;
        double gratuity, total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal (int) and a gratuity rate (int): ");

        subtotal = Integer.valueOf(scanner.next());
        gratuityRate = Integer.valueOf(scanner.next());

        gratuity = (double) subtotal * (gratuityRate / 100.0);
        total = (double) subtotal + gratuity;

        System.out.println("The gratuity is: $" + gratuity + " and total is: " + total);

    }

}
