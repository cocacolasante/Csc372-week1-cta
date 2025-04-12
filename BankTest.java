public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Testor", "Testing", 8675309);
        bankAccount.deposit(100.0);
        bankAccount.withdrawal(25);
        double endingBalance = bankAccount.getBalance();

        System.out.println("Expected balance to be 75, final balance: " + endingBalance);


        CheckingAccount checkingAccount = new CheckingAccount("testing2", "thenewer", 8003913, 0.0);

        checkingAccount.deposit(100);
        checkingAccount.processWithdrawal(200);
        double overdrawnBalance = checkingAccount.getBalance();

        System.out.println("Expected ending balance to be -100 and a -30 for the overdraft fee, ending balance is:" + overdrawnBalance);
    }
}