// imports
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        // Scanner var
        Scanner reader = new Scanner(System.in);
        // declare arraylist
        ArrayList<PersonalInformation> people = new ArrayList<>();

        // while loop logic
        while (true) {

            // read-in
            System.out.print("First name: ");
            String fname = reader.nextLine();

            // break cond
            if (fname.isEmpty()) {

                System.out.println("Empty firstName. Now terminating program.");
                break;

            }

            // continue read-in
            System.out.print("Last name: ");
            String lname = reader.nextLine();

            System.out.print("Identification number: ");
            int idNum = Integer.valueOf(reader.nextLine());

            // handle valid input
            people.add(new PersonalInformation(fname, lname, idNum));

        }

        System.out.println();
        for (PersonalInformation person : people) {

            System.out.println(person);

        }

    }

}
