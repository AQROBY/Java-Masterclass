public class SmartKitchen {
    private CofeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(CofeeMaker coffeeMaker,
                        DishWasher dishWasher,
                        Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    private void addWater(){
//        coffeeMaker.hasWorkToDo = true;
        coffeeMaker.brewCoffee();
    }

    private void pourMilk(){
//        refrigerator.hasWorkToDo = true;
        refrigerator.orderFood();
    }

    private void loadDishwasher(){
//        dishWasher.hasWorkToDo = true;
        dishWasher.doDishes();
    }

    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishwasher();
    }

    public CofeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
}
