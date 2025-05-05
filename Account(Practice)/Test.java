public class Test {
    public static void main(String[] args) {
        Account account = new Account(1, 150);
        CheckingAccount checking = new CheckingAccount(2, 35);
        SavingsAccount savings = new SavingsAccount(3, 35);

        checking.withdraw(100);
        savings.deposit(1000);
        account.transfer(20, savings);
        account.setBalance(900);

        System.out.println("Amount deposited: " + savings.getBalance());
        System.out.println("Amount Withdrawn: " + checking.getBalance());
        System.out.println("Current Balance: " + account.getBalance());

        
        Account[] accArray = new Account[3];
        accArray[0] = account;
        accArray[1] = checking;
        accArray[2] = savings;

        for(int i = 0; i < accArray.length; i++) {
            System.out.println("Balance: " + accArray[i].getBalance());
        }
        }  
}
