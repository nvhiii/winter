package helsinki_mooc.part2;

/**
 * Annoying example for method invocation via another method. Will revisit.
 *
 */

public class multiplicationTable {

    public static void main(String[] args) {

        multTable(3);

    }

    public static void multTable(int numRows) { // this method utilizes a while loop and a param to iterate to number of param rows, and calls another method to create values in rows

        int minRow = 1;
        while (minRow <= numRows) {

            lineContents(minRow, numRows);
            minRow++;

        }

    }
    public static void lineContents(int initialNum, int numColumns) { // method to create values for rows, uses 1 for first value, and other method param in a expression to iterate a while loop

        int firstNum = initialNum;
        while (firstNum <= initialNum * numColumns) { // here, we iterate if initNum is less than or equal to 1 * numColumns

            System.out.println(" " + firstNum);
            firstNum += initialNum;

        }

        System.out.println("");

    }

}
