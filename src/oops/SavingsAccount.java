package oops;

public class SavingsAccount extends Account {

    public SavingsAccount(double amount) {
        super(amount);
    }
    @Override
    public double calculateInterest() {
        System.out.println("Interest for Savings Account is: ");
        return getAmount() * 3.5 / 100;
        }

    /*public static void main (String[] args) {
        Account a = new SavingsAccount();
        a.setAmount(5000);
        System.out.println(a.calculateInterest());
    }*/
}
