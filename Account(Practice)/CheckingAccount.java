public class CheckingAccount extends Account {

    protected double limit;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
        limit = 200;
    }
    
    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    public void calcInterest() {
        if(this.getBalance() >= 0) {
            this.deposit(this.getBalance()* 5/100*1/12);
        }else {
            this.withdraw(this.getBalance()* 18/100*1/12);
        }
    }
}
