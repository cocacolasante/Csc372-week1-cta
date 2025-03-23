

public class BankAccount {
    // Fields:

// string firstName
private String firstName;
private String lastName;
private int accountID;
protected double balance;

// constructor():  initialize balance to zero
// deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
// withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
// Setters and getters for firstName, lastName, and accountID
// getBalance() getter to return the balance
// accountSummary() - prints all account information

public BankAccount(String _firstName, String _lastName, int _accountId){
    this.firstName = _firstName;
    this.lastName = _lastName;
    this.accountID = _accountId;
    this.balance = 0.0;
}

public void deposit(double amount){
    if(amount >0.0 ){
        this.balance += amount;
    }
}

public void withdrawal(double amount){
    if(this.balance - amount >=0 ){
        this.balance -= amount;
    }
}

public void accountSummary() {
    System.out.println("name: " + firstName + " " + lastName);
    System.out.println("ID: " + accountID);
    System.out.println("balance:$" + balance);
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

public int getAccountID() {
    return accountID;
}

public void setAccountID(int accountID) {
    this.accountID = accountID;
}

public double getBalance() {
    return balance;
}


}