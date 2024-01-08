package ch1;

import java.util.Scanner;
public class convo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String msg1 = scanner.nextLine();

        System.out.println("Oh, how interesting. Tell me more!");
        String msg2 = scanner.nextLine();

        System.out.println("Thanks for sharing!");

    }

}
