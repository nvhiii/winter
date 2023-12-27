package ch1;

public class exercise7 {

    /**
     * Approximate pi
     * Using Leibniz formula
     */

    public static void main(String[] args) {

        int numTerms = 10;
        double approxPI = 0;

        for (int i = 0; i < numTerms; i++) {

            double term = 1.0 / (2 * i + 1); // This is leibniz formula for nth term

            if (i % 2 == 0) {

                approxPI += term;

            } else {

                approxPI -= term;

            }

        }

        System.out.println(4 * approxPI);

    }

}
