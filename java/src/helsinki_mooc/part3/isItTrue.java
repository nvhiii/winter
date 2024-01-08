package helsinki_mooc.part3;

import java.util.Scanner;

public class isItTrue {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Give a string: ");
        String userString = reader.nextLine();

        trueOrNah(userString);

    }

    // true method
    public static void trueOrNah(String str) {

        if (str.equals("true")) {

            System.out.println("You got it right!");

        } else {

            System.out.println("Try again!");

        }

    }

}
