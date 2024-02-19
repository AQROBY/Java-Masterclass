public class Refrigerator extends Appliance{

    public Refrigerator(boolean hasWorkToDo){
        super(hasWorkToDo);
    }

    public void orderFood(){
        if (hasWorkToDo) {
            System.out.println("Ordering food...");
        }
    }
}
