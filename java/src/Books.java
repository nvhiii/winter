// imports
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    // main method
    public static void main(String[] args) {

        // scanner
        Scanner reader = new Scanner(System.in);

        // Arraylist declaration
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            // read in
            System.out.print("Title: ");
            String title = reader.nextLine();

            // break cond
            if (title.isEmpty()) {

                System.out.println("Empty title field. Now terminating program.");
                break;

            }

            // continue read in
            System.out.print("Pages: ");
            int pages = Integer.valueOf(reader.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(reader.nextLine());


            // handle valid input
            books.add(new Book(title, pages, publicationYear));

        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String whatInfo = reader.nextLine();

        for (Book book : books) {

            if (whatInfo.equals("everything")) {
                System.out.println(book);
            } else if (whatInfo.equals("name")) {
                System.out.println(book.getTitle());
            }

        }

    }

}
