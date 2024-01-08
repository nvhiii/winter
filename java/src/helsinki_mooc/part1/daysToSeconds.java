package ch1;

import java.util.Scanner;
public class daysToSeconds {

    /**
     * Program to convert x num of days to seconds
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());

        int dayToSec = days * 86400;

        System.out.println(dayToSec);

    }

}
