

public class CheckingAccount extends BankAccount {

    private static final double OVERDRAFT_FEE = 30.0;
    private double interestRate;

    /**
     * Constructs a new {@code CheckingAccount}.
     *
     * @param firstName    owners first name
     * @param lastName     owners last name
     * @param accountId    unique account identifier
     * @param interestRate annual interest rate 
     */
    public CheckingAccount(String firstName, String lastName, int accountId, double interestRate) {
        super(firstName, lastName, accountId);
        this.interestRate = interestRate;
    }

    /**

     * if amount  is greater than the current balance, the account is
     * overdrawn and an overdraft fee is applied.
     *
     * @param amount amount to withdraw
     * @throws IllegalArgumentException if amount <= 0
     */
    public void processWithdrawal(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (amount <= getBalance()) {
            withdrawal(amount);
            System.out.printf("%s successfully withdrew: $%.2f%n", getFirstName(), amount);
        } else {
            balance = balance - amount - OVERDRAFT_FEE;
            System.out.printf("%s has overdrawn the account%nNew balance (negative): $%.2f%n",
                    getFirstName(), getBalance());
        }
    }

    /**
     * displays account details with interest rate.
     */
    public void displayAccount() {
        System.out.println("Checking account details:");
        accountSummary();
        System.out.printf("Interest rate: %.2f%%%n", interestRate * 100);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
