package ch1;

import java.util.Scanner;
public class intInput {

    /**
     * In this program, we will read input string, and convert into int
     *
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        // or just do int num = scanner.nextInt();

        System.out.println("You wrote: " + num);

    }

}
