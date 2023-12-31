package helsinki_mooc.part2;

public class divisionMethod {

    public static void main(String[] args) {

        divide(3, 5);

    }

    public static void divide(int numerator, int denominator) {

        double quotient = (double) numerator / denominator;
        System.out.println("The quotient of " + numerator + " and " + denominator + " is " + quotient);

    }

}
