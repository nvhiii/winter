package helsinki_mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The exercise template contains a base that reads
 * numbers from the user and adds them to a list.
 * Reading is stopped once the user enters the number -1.
 *
 * When reading ends, calculate the average of
 * the numbers in it, and then print that value.
 *
 */
public class averageListForEach {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        // populating arrayList via user input
        while (true) {

            int userNum = Integer.valueOf(reader.nextLine());

            if (userNum == -1) {

                System.out.println("Input -1 detected. Terminating.");
                break;

            }

            numList.add(userNum);

        }

        int sum = 0, numOfNums = 0;
        for (int num : numList) {

            sum += num;
            numOfNums++;

        }

        double avg = (double) sum / numOfNums;
        System.out.println("Average: " + avg);

    }

}
