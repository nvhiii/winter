package helsinki_mooc.part2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class areWeThereYet {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {

            System.out.println("Give a number: ");
            int inputNum = Integer.valueOf(reader.nextLine());

            if (inputNum == 4) {

                break;

            }

        }

        System.out.println("Got a 4!");

    }

}
