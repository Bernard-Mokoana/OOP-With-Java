/**
 * Credit
 */
public class Credit extends Account {

    private int overdraftLimits;

    public Credit(){
        this("0000000000", 0, 0);
    }

    public Credit(String accountNumber, int balance, int overdraftLimits) {
        super(accountNumber, balance);
        setOverdraftLimit(overdraftLimits);
    }

    public int calculateInterest(int rate){
        int interest = 0;
        if (getBalance() < getOverdraftimit())
            interest = getBalance() * 4 * rate / 100;
        else if(getBalance() < 0)
          interest = getBalance() * 2 * rate / 100;
        else
              interest = getBalance() * 2 * rate / 100;
              return interest;
    }

    public void setOverdraftLimit(int overdraftLimits) {
        this.overdraftLimits = overdraftLimits;
    }

    public int getOverdraftimit(){
        return overdraftLimits;
    }

    public String toString() {
        return super.toString() + " and overdraft limit " + getOverdraftimit();
    }
}