public class Car extends Vehicle implements Electric {
    @Override
    public void startEngine() {
        System.out.println("Mobil dinyalakan dengan tombol start.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Baterai mobil sedang diisi daya.");
    }
}
