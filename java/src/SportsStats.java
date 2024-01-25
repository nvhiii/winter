// import(s)
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Write a program that prompts the user for a filename,
 * after which it reads the match statistics from the file.
 * The program then prompts the user for the name of a team,
 * and prints the data specified in the following parts for
 * that team.
 */

public class SportsStats {

    // main method
    public static void main(String[] args) {

        // arraylists for each data storage + comparison
        ArrayList<String> teams = new ArrayList<>();
        // scanner for file name
        Scanner reader = new Scanner(System.in);

        // team counter
        int teamCount = 0;

        // prompt user for file name
        System.out.println("File: ");
        String fileName = reader.nextLine();

        // prompt userfor team
        System.out.println("Team: ");
        String teamName = reader.nextLine();

        // try-catch block for reading file content
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            // while loop to iterate over each line
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                // logic to split each csv line by comma delimiter
                String[] split = line.split(",");

                teams.add(split[0]);

            }

            for (String t : teams) {

                if (t.equals(teamName)) {

                    teamCount++;

                }

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println(teamCount);

    }

}
