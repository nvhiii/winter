package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class sizeOfList {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {

            String userInput = reader.nextLine();

            if (userInput.equals("")) {

                System.out.println("Empty string entered. Now terminating.");
                break;

            }

            names.add(userInput);

        }

        System.out.println("In total: " + names.size());

    }

}
