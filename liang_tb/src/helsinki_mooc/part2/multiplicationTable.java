package helsinki_mooc.part2;

/**
 * Annoying example for method invocation via another method. Will revisit.
 *
 */

public class multiplicationTable {

    public static void main(String[] args) {

        multTable(3);

    }

    public static void multTable(int numRows) {

        int minRow = 1;
        while (minRow <= numRows) {

            lineContents(minRow, numRows);
            minRow++;

        }

    }

    public static void lineContents(int initialNum, int numColumns) {

        int firstNum = initialNum;
        while (firstNum <= initialNum * numColumns) {

            System.out.println(" " + firstNum);
            firstNum += initialNum;

        }

        System.out.println("");

    }

}
