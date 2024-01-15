// imports
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ItemMain {

    public static void main(String[] args) {

        // scanner var
        Scanner reader = new Scanner(System.in);
        // arraylist for items
        ArrayList<Item> items = new ArrayList<>();

        // while loop for logic
        while (true) {

            // read in prompt
            System.out.print("Name: ");
            // item name string
            String itemName = reader.nextLine();

            // break cond
            if (itemName.equals("")) {

                System.out.println("Empty string detected. Now terminating.");
                break;

            }

            // handle valid input
            // this nifty trick instantiates + adds to arraylist in same line
            items.add(new Item(itemName));

        }

        for (Item item : items) {

            System.out.println(item);

        }

    }

}
