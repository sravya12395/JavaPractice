package oops;

public class CurrentAccount extends Account {

    public CurrentAccount(double amount) {
        super(amount);
    }

    public double calculateInterest() {
        System.out.println("Interest for current account is :");
        return getAmount() * 0/100;
    }
}
