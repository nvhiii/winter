// import(s)
import java.sql.SQLOutput;
import java.util.Scanner;
import java.nio.file.Paths;

/**
 * Your task is to write a program that first prompts
 * the user for the name of the file they want to read.
 * The program then prints the content of the file in the
 * following way (we're assuming below that the output is
 * from the above-mentioned file):
 */

public class RecordsFromAFile {

    // main method
    public static void main(String[] args) {

        // user input scanner
        Scanner reader = new Scanner(System.in);

        // prompt user for file name
        System.out.println("Name of the file: ");
        String fileName = reader.nextLine();

        // try catch block
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] split = line.split(",");
                System.out.println(split[0] + ", age: " + split[1] + " years");

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
