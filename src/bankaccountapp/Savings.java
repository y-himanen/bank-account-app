package bankaccountapp;

public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "1" + accNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features: " +
                "\n    Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n    Safety Deposit Box Key: " + safetyDepositBoxKey +
                "\n    Rate: " + rate + "%");
    }

}
