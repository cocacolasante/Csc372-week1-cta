public class CheckingAccount extends BankAccount{
    private double interestRate;


    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount){
        if( amount >this.getBalance()){
            withdrawal(amount);
            System.out.println(getFirstName() +"sucessfully withdrew: " + amount);
        } else{
            double overdraftFee = 30.0;

            this.balance = this.balance - amount - overdraftFee;
            System.out.println(getFirstName() + "has overdrawn the account");
            System.out.println("New balance (negative): $" + balance);
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
