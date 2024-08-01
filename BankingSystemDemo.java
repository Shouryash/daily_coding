import java.util.ArrayList;
import java.util.List;

// Interface Account with methods to deposit, withdraw, calculate interest, and view balance
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

// Class SavingsAccount implementing the Account interface
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public double getBalance() {
        return balance;
    }

    // Unique method for SavingsAccount
    public void addInterest() {
        balance += calculateInterest();
    }
}

// Class CurrentAccount implementing the Account interface
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    public double calculateInterest() {
        return 0; // Typically, no interest is paid on Current Accounts
    }

    public double getBalance() {
        return balance;
    }

    // Unique method for CurrentAccount
    public void checkOverdraft() {
        if (balance < 0) {
            System.out.println("Account is overdrawn.");
        } else {
            System.out.println("Account is within the limit.");
        }
    }
}

// Class Bank with a list of accounts
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to list all account balances
    public void listAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Balance: " + account.getBalance());
        }
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 2.5);
        CurrentAccount currentAccount = new CurrentAccount(2000.0, 500.0);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        bank.listAccounts();
    }
}
