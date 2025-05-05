public class TestExceptions {
    public static void main(String[] args) {
        try {
            Account account1 = new Account("1234567890123456");
            System.out.println("Account 1 created successfully with account number: " + account1.getAccountNumber());
        } catch (InvalidAccountNumberException e) {
            System.err.println("Error creating Account 1: " + e.getMessage());
        }

        try {
            Account account2 = new Account("9876543210987654");
            System.out.println("Account 2 created successfully with account number: " + account2.getAccountNumber());
        } catch (InvalidAccountNumberException e) {
            System.err.println("Error creating Account 2: " + e.getMessage());
        }
    }
}