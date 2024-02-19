public class Main {
    public static void main (String[] args){
//        BankAccount bankAccount = new BankAccount("12345", 1000.00,
//                "Robert", "myemail@email.com", "01235468412");
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getAccountBalance());
//        bankAccount.setAccountBalance(2000);
//        bankAccount.setAccountNumber("Robert's account");
//        bankAccount.setEmail("robert@yahoo.com");
//        bankAccount.setCustomerName("Robert");
//        bankAccount.setPhoneNumber("0745652321");

        bankAccount.withdraw(2000);
        bankAccount.withdraw(2000);
        bankAccount.deposit(3500.50);
        bankAccount.withdraw(3600.50);
        bankAccount.withdraw(352.50);
        bankAccount.withdraw(352.50);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com",
                "12646");
        System.out.println("Account No: " + timsAccount.getAccountNumber() + "; name " +
                timsAccount.getCustomerName());
    }
}
