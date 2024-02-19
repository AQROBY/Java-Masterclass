public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default email",
                "Default phone");
        System.out.println(("Empty constructor called"));
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email,
                       String phone){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email, phoneNumber);
    }

    public String getAccountNumber (){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Deposit amount is $" + depositAmount + ", balance is now $"
                + this.accountBalance);
    }

    public void withdraw (double withdrawAmount){
        double funds = this.accountBalance - withdrawAmount;
        if (funds < 0){
            System.out.println("Balance is negative");
        } else {
            this.accountBalance = funds;
            System.out.println("Withdrawn amount is $" + withdrawAmount + ", balance is now $"
                    + this.accountBalance);
        }
    }
}
