package ch1;

import java.util.Scanner;
public class scannerIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string.");

        String msg = scanner.nextLine();
        System.out.println(msg);

    }

}
