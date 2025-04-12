public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountId;
    protected double balance;

    /**
     * @param firstName owners first name
     * @param lastName  owners last name
     * @param accountId unique account identifier
     */
    public BankAccount(String firstName, String lastName, int accountId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountId = accountId;
        this.balance = 0.0;
    }

    /**
     * @param amount the amount to deposit;
     * @throws IllegalArgumentException if amount <= 0
     */
    public void deposit(double amount) {
        validatePositiveAmount(amount);
        balance += amount;
    }

    /**
     * @param amount the amount to withdraw; 
     * @throws IllegalArgumentException if amount <= 0 or insufficient funds
     */
    public void withdrawal(double amount) {
        validatePositiveAmount(amount);
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    /**
     * prints a summary of the account to System.out.
     */
    public void accountSummary() {
        System.out.printf("Name: %s %s%nID: %d%nBalance: $%.2f%n",
                firstName, lastName, accountId, balance);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    private void validatePositiveAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
