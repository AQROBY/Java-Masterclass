public class Burger {
    private String type;
    private double price;
    private int numberOfToppings;

    public Burger(String type, double price){
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public double getNumberOfToppingsPrice(){
        return numberOfToppings * 5;
    }

    public void addTopping(){
        if (this.numberOfToppings >= 3){
            throw new RuntimeException("Not allowed more than 3 toppings");
        }
        this.numberOfToppings += 1;

        this.price += 5;
    }
}
