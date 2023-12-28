package ch1;

import java.util.Scanner;
public class diffInputs {

    /**
     * Testing program for different types of data types, namely string int bool double
     *
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String randString = scanner.nextLine();

        System.out.println("Give an integer: ");
        int randInt = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double: ");
        double randDouble = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean: ");
        boolean randBool = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + randString);
        System.out.println("You gave the integer " + randInt);
        System.out.println("You gave the double " + randDouble);
        System.out.println("You gave the boolean " + randBool);

    }

}
