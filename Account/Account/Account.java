/**
 * Account
 */
public abstract class Account implements Interest {

    private String accountNumber;
    private int balance;

    public Account(){
        this("0000000000" , 0);
    }

    public  Account(String accountNumber, int balance){
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber){
       if (!isValidAccountNumber(accountNumber)) {
           throw new InvalidAccountNumberException("The account number is invalid.");
      }
            this.accountNumber = accountNumber;
    }

    private boolean isValidAccountNumber(String accountNumber) {
        int sum = 0;
        for (int i = accountNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(accountNumber.charAt(i));
            if ((accountNumber.length() - i) % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
             }
            }
            sum += digit;
        }
      return sum % 11 == 0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public String toString(){
        return "Account no: " + getAccountNumber()+ " has balance of " + getBalance();
    }
}