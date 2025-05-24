public class MainApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        motorcycle.startEngine();

        if (car instanceof Electric) {
            ((Electric) car).chargeBattery();
        }
    }
}
