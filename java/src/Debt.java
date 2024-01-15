public class Debt {

    // class variables
    private double balance;
    private double interestRate;

    // constructor
    public Debt(double initialBalance, double initialInterestRate) {

        this.balance = initialBalance;
        this.interestRate = initialInterestRate;

    }

    // method to print current balance
    public void printBalance() {

        System.out.println(balance);

    }

    //
    public void waitOneYear() {

        balance *= interestRate;

    }


}
