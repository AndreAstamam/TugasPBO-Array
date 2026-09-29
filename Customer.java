public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Account getAccount(int accountIndex) {
        if (accountIndex >= 0 && accountIndex < numberOfAccounts) {
            return accounts[accountIndex];
        } else {
            System.out.println("Invalid account index.");
            return null;
        }   
    }
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public void setAccount(Account acct) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts++] = acct;
        } else {
            System.out.println("Cannot add more accounts. Maximum limit reached.");
        }
    }
}
