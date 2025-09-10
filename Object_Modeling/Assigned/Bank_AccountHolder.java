package Object_Modeling;

import java.util.ArrayList;

class Customer {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Account acc) {
        accounts.add(acc);
    }

    void viewBalance() {
        System.out.println("\nCustomer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.accNo + " , Balance: " + acc.balance);
        }
    }
}

class Account {
    int accNo;
    double balance;
    Bank bank;   // association with Bank

    Account(int accNo, double balance, Bank bank) {
        this.accNo = accNo;
        this.balance = balance;
        this.bank = bank;
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c, int accNo, double amount) {
        Account acc = new Account(accNo, amount, this);
        c.addAccount(acc);

        if (!customers.contains(c)) {
            customers.add(c);
        }

        System.out.println("Account opened in " + bankName + " for " + c.name);
    }

    void showCustomers() {
        System.out.println("\nBank: " + bankName + " has customers:");
        for (Customer c : customers) {
            System.out.println(c.name);
        }
    }
}

public class Bank_AccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Yanshi");
        Customer c2 = new Customer("Khushi");

        bank.openAccount(c1, 101, 5000);
        bank.openAccount(c1, 102, 3000);
        bank.openAccount(c2, 201, 10000);

        bank.showCustomers();

        c1.viewBalance();
        c2.viewBalance();

	}

}
