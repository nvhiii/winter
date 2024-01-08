package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * Write a program, that reads a string
 * from the user and then prints it three times.
 */
public class printThrice {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Give a word: ");
        String str = reader.nextLine();

        // empty println separates input and outpt of the printThriceMethod
        System.out.println();
        printThriceMethod(str);

    }

    public static void printThriceMethod(String input) {

        for (int i = 0; i < 3; i++) {

            System.out.print(input);

        }

    }

}
