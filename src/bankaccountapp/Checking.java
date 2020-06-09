package bankaccountapp;

public class Checking extends Account {
    private int debitCardNo;
    private int getDebitCardPIN;

    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accNumber = "2" + accNumber;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNo = (int) (Math.random() * Math.pow(10, 12));
        getDebitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features:" +
                "\n    Debit Card Number: " + debitCardNo +
                "\n    Debit Card Pin: " + getDebitCardPIN +
                "\n    Rate: " + rate + "%");
    }

}
