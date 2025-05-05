public class Account {

    private int id;
    private double balance;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int newId, double newBalance) {
        newId = id;
        newBalance = balance;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
        this.getBalance();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void transfer(double amount, Account other) {
        if(this.balance >= amount) {
            this.withdraw(amount);
            this.deposit(amount);
        }
    }

    public boolean equals(SavingsAccount acc) {
        if(this.getBalance() == acc.getBalance()) {
            return true;
        } else {
            return false;
        }
    }
}
