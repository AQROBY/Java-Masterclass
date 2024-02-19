public class Main {
    public static void main(String[] args) {
        CofeeMaker cofeeMaker = new CofeeMaker(true);
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(true);

        SmartKitchen smartKitchen = new SmartKitchen(cofeeMaker,
                dishWasher, refrigerator);
        smartKitchen.doKitchenWork();
    }
}
