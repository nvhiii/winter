package helsinki_mooc.part1;

import java.util.Scanner;
public class orwellAncient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = Integer.valueOf(scanner.nextLine());

        if (year == 1984) {

            System.out.println("Orwell");

        } else if (year < 2015) {

            System.out.println("Ancient!");

        }

    }

}
