package ch1;

import java.util.Scanner;

public class helloUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");

        String name = scanner.nextLine();

        System.out.println("Hi, " + name);

    }

}
