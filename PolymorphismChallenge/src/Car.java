public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        runEngine();
    }

    public void drive(){
        System.out.println("Driving the car...");
        System.out.println("Car type: " + getClass().getSimpleName());
    }

    protected void runEngine(){
        System.out.println("Engine going vrruum...");
    }
}
