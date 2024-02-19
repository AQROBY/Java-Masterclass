public class Main {
    public static void main(String[] args){

        //Test with standard order (no args constructor)
        MealOrder mealOrder = new MealOrder();
        mealOrder.addAdditionalToppings();
        mealOrder.addAdditionalToppings();
        mealOrder.addAdditionalToppings();
        mealOrder.addAdditionalToppings();
        mealOrder.changeDrinkSize("large");
        mealOrder.printTotalDueAmount();
        mealOrder.printItemList();

        System.out.println("--------------------------");

        //Test with composed items in order (args constructor)
        Burger burger = new Burger("Double Cheese Burger", 35);
        Drink drink = new Drink("Coke", "small");
        SideItem sideItem = new SideItem("Carrot Cake", 15);
        MealOrder newMealOrder = new MealOrder(burger, drink, sideItem);
        newMealOrder.printTotalDueAmount();
        newMealOrder.changeDrinkSize("medium");
        newMealOrder.printTotalDueAmount();
        newMealOrder.addAdditionalToppings();
        newMealOrder.addAdditionalToppings();
        newMealOrder.printTotalDueAmount();
        newMealOrder.printItemList();

        System.out.println("--------------------------");

        //Test with deluxe burger
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        Drink coke = new Drink("Coke", "medium");
        SideItem garlicSauce = new SideItem("Garlic Sauce", 10);
        MealOrder deluxeOrder = new MealOrder(deluxeBurger, coke, garlicSauce);
        deluxeOrder.printTotalDueAmount();
        deluxeOrder.printItemList();
        deluxeOrder.addAdditionalToppings();
        deluxeOrder.addAdditionalToppings();
        deluxeOrder.addAdditionalToppings();
        deluxeOrder.addAdditionalToppings();
        deluxeOrder.addAdditionalToppings();
        deluxeOrder.addAdditionalToppings();
        deluxeOrder.printTotalDueAmount();
        deluxeOrder.printItemList();
    }
}
