public class CofeeMaker extends Appliance{

    public CofeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Brewing some coffee...");
        }
    }
}
