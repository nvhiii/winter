package helsinki_mooc.part2;

import java.util.Scanner;

/**
 *
 */

public class repeatBreakRemember {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numOfNums = 0;
        int even = 0, odd = 0;

        System.out.println("Give numbers: ");
        while (true) {

            int userInput = Integer.valueOf(reader.nextLine()); // read input

            if (userInput == -1) { // break case(s)

                System.out.println("Thx! Bye!");
                break;

            }

            // continue case 1

            if (userInput % 2 == 0) {

                even++;

            } else {

                odd++;

            }

            sum += userInput; // handle valid stuff
            numOfNums++;

        }

        double avg = (double) sum / numOfNums;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNums);
        System.out.println("Average: " + avg);
        System.out.println("Even #s: " + even);
        System.out.println("Odd #s: " + odd);

    }

}
