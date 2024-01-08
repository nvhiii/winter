package helsinki_mooc.part3;

public class printStarsArray {

    // main method
    public static void main(String[] args) {

        // initialize array
        int[] nums = {5, 1, 3, 4, 2};

        // invoke method
        printArrayInStars(nums);

    }

    // method that will be invoked
    public static void printArrayInStars(int[] array) {

        // iterates over each inde loop
        for (int i = 0; i < array.length; i++) {

            // store value of each index
            int num = array[i];

            for (int j = 0; j < num; j++) {

                System.out.print("*");

            }

            System.out.println();

        }
    }

}
