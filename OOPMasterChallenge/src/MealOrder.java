public class MealOrder {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double price;

    public MealOrder(){
        this.burger = new Burger("Standard Burger", 20);
        this.drink = new Drink("Cola", "Medium");
        this.sideItem = new SideItem("Cake", 10.5);
        this.price = getPrice();
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem){
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
        this.price = getPrice();
    }

    public void addAdditionalToppings(){
        try {
            burger.addTopping();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void changeDrinkSize(String size){
        drink.setSize(size);
    }

    public void printItemList(){
        System.out.println(burger.getType() + " - " + burger.getPrice() + "\n"
                + "of which toppings " + burger.getNumberOfToppings() + " - "
                + burger.getNumberOfToppingsPrice() + "\n"
                + drink.getType() + " - " + drink.getPrice() + "\n"
                + sideItem.getType() + " - " + sideItem.getPrice());
    }

    public void printTotalDueAmount(){
        System.out.println("Total due amount is " + getPrice());
    }

    private double getPrice(){
        return this.burger.getPrice() + this.drink.getPrice() + this.sideItem.getPrice();
    }
}
