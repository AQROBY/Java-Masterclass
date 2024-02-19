public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("Robert", 1000, "robert@mail.com");
        System.out.println("No args constructor called");
    }

    public Customer(String name, String email){
        this(name, 5000, "email@email.com");
    }

    public String getName(){
        return name;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public String getEmail(){
        return email;
    }
}
