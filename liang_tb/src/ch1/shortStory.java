package ch1;

import java.util.Scanner;
public class shortStory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");
        String mc = scanner.nextLine();

        System.out.println("What is their job?");
        String job = scanner.nextLine();

        System.out.println("Here is the story:\n" +
                "Once upon a time there was " + mc + ", who was a " + job + ".\n" +
                "On the way to work, " + mc + " reflected on life.\n" +
                "Perhaps " + mc + " will not be a " + job + " forever.");

    }

}
