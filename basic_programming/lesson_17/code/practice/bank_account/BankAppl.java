package practice.bank_account;

import practice.bank_account.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {

        BankAccount acc0 = new BankAccount(100L, "Bill Smith", "Bank#1", 1, 100);
        acc0.display();
        System.out.println(acc0.getOwner());
        System.out.println(acc0.getBalance());
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        acc0.withdraw(350);
        System.out.println(acc0.getBalance());
        acc0.withdraw(300);
        System.out.println(acc0.getBalance());
        acc0.withdraw(250);
        System.out.println(acc0.getBalance());

        BankAccount acc1 = new BankAccount(200l, "Bank#1", 1);
        System.out.println(acc1.getOwner());

        BankAccount acc2 = new BankAccount(300L, "Bank#1", 1, 0.0);
        System.out.println(acc2.getOwner());

    }
}
