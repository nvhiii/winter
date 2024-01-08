package helsinki_mooc.part2;

import java.util.Scanner;
public class carryOn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // better convention is to name scanner to reader

        while(true) {

            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();

            if (input.equals("no")) {

                break;

            }

        }

    }

}
