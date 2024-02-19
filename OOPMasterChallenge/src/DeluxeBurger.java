public class DeluxeBurger extends Burger{
    private String type;
    private double price;
    private int numberOfToppings;

    public DeluxeBurger(){
        super("Deluxe Burger", 50);
    }

    @Override
    public void addTopping(){
        if (this.numberOfToppings >= 5){
            throw new RuntimeException("Not allowed more than 5 toppings");
        }
        this.numberOfToppings += 1;
    }
}
