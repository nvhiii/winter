package helsinki_mooc.part4;


public class Account {

    private String name;
    private double money;

    // constructor
    public Account(String accName, double accMoney) {

        name = accName;
        money = accMoney;

    }

    // balance getter method
    public double balance() {

        return money;

    }

    // name getter method
    public String getName() {

        return name;

    }

    // withdraw method, UPDATE MONEY VAR
    public double withdraw(int amountToWithdraw) {

        return money -= amountToWithdraw;

    }

    // deposit method, UPDATE MONEY VAR
    public double deposit(int amountToDeposit) {

        return money += amountToDeposit;

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public static void main(String[] args) {

        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland,", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

    }

}
