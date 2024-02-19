public class Main {

    public static void main(String[] args){

        Car car = new GasPoweredCar("Pretty",
                256, 2);
        car.startEngine();
        car.drive();
    }
}
