public class DishWasher extends  Appliance{

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes(){
        if (hasWorkToDo) {
            System.out.println("Doing the dishes...");
        }
    }
}
