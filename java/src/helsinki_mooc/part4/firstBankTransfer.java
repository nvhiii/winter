package helsinki_mooc.part4;

/**
 * The Account from the previous exercise class is also available in this exercise.
 *
 * Write a program that:
 *
 * Creates an account named "Matthews account" with the balance 1000
 * Creates an account named "My account" with the balance 0
 * Withdraws 100.0 from Matthew's account
 * Deposits 100.0 to "my account"
 * Prints both the accounts
 *
 */

public class firstBankTransfer {

    public static void main(String[] args) {

        Account matthewsAccount = new Account("Matthew's Account", 1000);
        Account myAccount = new Account("My account", 0);

        double withdrawn = matthewsAccount.withdraw(100);
        myAccount.deposit((int) withdrawn);

        System.out.println(matthewsAccount.balance());
        System.out.println(myAccount.balance());

    }

}
