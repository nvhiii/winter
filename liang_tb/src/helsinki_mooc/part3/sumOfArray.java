package helsinki_mooc.part3;

/**
 * Sum of an array program, using a method
 *
 */
public class sumOfArray {

    // main method
    public static void main(String[] args) {

        // array initialization
        int[] nums = {1, 2, 3, 4, 5};

        // method invocation
        System.out.println(sumOfNumbersInArray(nums));

    }

    public static int sumOfNumbersInArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        return sum;

    }

}
