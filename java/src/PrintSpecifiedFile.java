// import(s)
import java.util.Scanner;
import java.nio.file.Paths;

public class PrintSpecifiedFile {

    // main method
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String userInput = reader.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(userInput))) {

            while (scanner.hasNextLine()) {

                // assign string
                String row = scanner.nextLine();
                // print string
                System.out.println(row);

            }

        } catch (Exception e) { // catch exception, must write this before the body of try block

            System.out.println("Error: " + e.getMessage());

        }

    }

}
