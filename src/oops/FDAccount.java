package oops;

public class FDAccount extends Account {

    public FDAccount(double amount) {
        super(amount);
    }

    @Override
    public double calculateInterest() {
        System.out.println("Interest for FD Account is: ");
        return getAmount() * 5.75 / 100;
    }
}
