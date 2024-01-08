package helsinki_mooc.part1;

import java.util.Scanner;
public class conditionalOddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer value: ");
        int num = Integer.valueOf(scanner.nextLine());

        if (num % 2 == 0) {

            System.out.println("Even number");

        } else {

            System.out.println("Odd number");

        }

    }

}
