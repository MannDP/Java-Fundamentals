package bankAccounts;

public class AccountMethods {
    //data members
    private int accountNumber;
    private double balance;

    //constructors
    public AccountMethods() {
        this.accountNumber = 0;
        this.balance = 0;
    }

    public AccountMethods(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public AccountMethods(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //getters and setters for the private variables
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.balance;
    }

    public void setAccountNumber(int newAccountNumber) {
        if (newAccountNumber <= 0) {
            System.out.println("error: AccountMethods number cannot be negative");
            return;
        }

        else {
            this.accountNumber = newAccountNumber;
            return;
        }
    }

    public void setAccountBalance(int newAccountBalance) {
        if (newAccountBalance < 0) {
            System.out.println("error: AccountMethods balance cannot be negative");
            return;
        }

        else {
            this.balance = newAccountBalance;
            return;
        }
    }


    //main methods
    public void creditBalance(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("error: deposit amount must be positive, non-zero quantity");
            return;
        }

        else {
            this.balance += depositAmount;
            return;
        }
    }

    public void debitBalance (double withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            System.out.println("error: you do not have sufficient funds to withdraw $" + withdrawAmount + " .");
        }


        else {
            this.balance -= withdrawAmount;
        }
    }

    public String accountInformation() {
        String accountState = "A/C no: " + this.accountNumber + ", Balance: $" + this.balance;
        return accountState;
    }
}
