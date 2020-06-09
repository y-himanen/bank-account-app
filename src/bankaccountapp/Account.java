package bankaccountapp;

public abstract class Account implements IBaseRate {
    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;
    protected String accNumber;
    protected double rate;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;
        index++;
        this.accNumber = setAccNumber();
        setRate();
    }

    private String setAccNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public abstract void setRate();

    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
    }

    public void deposit(double amount) {
        balance += amount;
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        printBalance();
    }

    public void transfer(String receiver, double amount) {
        balance -= amount;
        System.out.println("Transferred $" + amount + " to " + receiver);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance: $" + balance);
    }

    public void showInfo() {
        System.out.println("Name: " + name +
                "\nAccount number: " + accNumber +
                "\nBalance: " + balance);
    }

}
