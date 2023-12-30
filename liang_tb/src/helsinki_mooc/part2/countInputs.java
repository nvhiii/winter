package helsinki_mooc.part2;

import java.util.Scanner;
public class countInputs {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int num = 0;
        int userInput = Integer.valueOf(reader.nextLine());

        while (num <= userInput) {

            System.out.println(num);
            num++;

        }

    }

}
