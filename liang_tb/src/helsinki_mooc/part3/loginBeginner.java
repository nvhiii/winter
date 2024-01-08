package helsinki_mooc.part3;

import java.util.Scanner;

/**
 * Sample login issue using strings and .equals()
 *
 */

public class loginBeginner {

    // main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // username input
        System.out.print("Enter username: ");
        String user = reader.nextLine();

        // password input
        System.out.print("Enter password: ");
        String pwd = reader.nextLine();

        // method invocation
        checkLogin(user, pwd);

    }

    public static void checkLogin(String username, String password) {

        // default user1: alex, user2: emma
        // default pwd1: sunshine, pwd2: haskell
        // BAD method of login, this is just example of howto use .equals(), DO NOT DO THIS in actual PRODUCTION

        if (username.equals("alex") && password.equals("sunshine")) {

            System.out.println("You have successfully logged in!");

        } else if (username.equals("emma") && password.equals("haskell")) {

            System.out.println("You have successully logged in!");

        } else {

            System.out.println("Incorrect username or password!");

        }

    }

}
