package oops;

public class Account {

    private double amount;

    //We can either set amount using setter method or constructor
    /*public void setAmount(double amount) {
        this.amount = amount;
    }*/
    public Account(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public double calculateInterest() {
        System.out.println("Interest is calculated based on the account type");
        return 0;
    }
}
