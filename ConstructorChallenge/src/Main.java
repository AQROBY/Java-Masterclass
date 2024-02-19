public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.getName());

        Customer anotherCustomer = new Customer("Tim", "tim@tim.com");
        System.out.println(anotherCustomer.getCreditLimit());

        Customer yetAnotherCustomer = new Customer("Robert", 4000, "robert@web.com");
        System.out.println(yetAnotherCustomer.getName());
        System.out.println(yetAnotherCustomer.getCreditLimit());
        System.out.println(yetAnotherCustomer.getEmail());

    }
}
