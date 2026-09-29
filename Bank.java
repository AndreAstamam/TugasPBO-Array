public class Bank {
    private Customer[] customers = new Customer[5];
    private int numberOfCustomers;
    public Bank() {
        numberOfCustomers = 0;
    }
    public void addCustomer(String firstName, String lastName) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers++] = new Customer(firstName, lastName);
        } else {
            System.out.println("Cannot add more customers. Maximum limit reached.");
        }
    }
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    public Customer getCustomer(int customerIndex) {
        if (customerIndex >= 0 && customerIndex < numberOfCustomers) {
            return customers[customerIndex];
        } else {
            System.out.println("Invalid customer index.");
            return null;
        }
    }
}
