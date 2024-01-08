package helsinki_mooc.part3;

import java.util.Scanner;

public class loopOrder {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter positive integers to find the average. A negative number terminates the program.");

        int sum = 0, numOfNums = 0;
        while (true) {

            int userInput = Integer.valueOf(reader.nextLine()); // read input

            if (userInput < 0) {

                break; // break

            }

            if (userInput == 0) {

                continue; // continue (will ignore this)

            }

            sum += userInput; // handle valid input
            numOfNums++;

        }

        double avg = (double) sum / numOfNums;
        System.out.println(avg); // look into truncation of said numbers

    }

}
