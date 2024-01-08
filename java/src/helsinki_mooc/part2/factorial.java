package helsinki_mooc.part2;

import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: ");
        int factorialNum = Integer.valueOf(reader.nextLine());
        int product = 1;

        if (factorialNum == 0) {

            System.out.println("Factorial of !0 is 0.");

        } else {

            for (int i = 1; i <= factorialNum; i++) {

                product *= i;

            }

        }

        System.out.println("Factorial: " + product);


    }

}
