package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Engine car = new Car();

        // car.acc();
        // car.stop();
        // car.start();

        // Media carMedia = new Car();
        // carMedia.stop();

        // System.out.println(Engine.price);

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
