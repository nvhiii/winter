package ch1;

import java.util.Scanner;
public class booleanInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a boolean or a statement: ");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        // or can do boolean bool = scanner.nextBoolean();

        System.out.println("True or false? " + bool);

    }

}
