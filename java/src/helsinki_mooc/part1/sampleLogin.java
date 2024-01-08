package helsinki_mooc.part1;

import java.util.Scanner;
public class sampleLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String user = scanner.nextLine();

        System.out.println("Password: ");
        String pwd = scanner.nextLine();

        if (pwd.equals("Caput Draconis") && user.equals("Nahi")) {

            System.out.println("Welcome, Nahi");

        } else {

            System.out.println("Off with you!");

        }


    }

}
