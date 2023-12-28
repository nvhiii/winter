package ch1;

import java.util.Scanner;

public class readLineIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string, any string.");
        String msg = scanner.nextLine();

        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);

    }

}
