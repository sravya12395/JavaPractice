package oops;

import oops.Account;
import oops.SavingsAccount;
import oops.CurrentAccount;
import oops.FDAccount;
public class AccountMain {

    public static void main (String[] args) {
        Account[] acc = {new SavingsAccount(5000),
                        new CurrentAccount(1000),
                        new FDAccount(10000)};


        for (int i = 0; i < acc.length; i++) {
            //acc[i].setAmount(5000);
            System.out.println(acc[i].calculateInterest());
        }

    }
}
