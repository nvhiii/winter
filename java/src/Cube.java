// import(s)

import java.util.Scanner;

public class Cube {

    // main method
    public static void main(String[] args) {

        // scanner
        Scanner reader = new Scanner(System.in);

        while (true) {

            // read in
            String userInput = reader.nextLine();

            // break cond
            if (userInput.equals("end")) {

                System.out.println("Input of [end] enterd. Now terminating.");
                break;

            }

            // handle valid input
            int num = Integer.valueOf(userInput);
            int cubedNum = (int) Math.pow(num, 3);
            System.out.println(cubedNum);

        }

    }

}
