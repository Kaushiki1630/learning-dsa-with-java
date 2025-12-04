package OOPS.Interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start Electic Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Electic Engine");
    }

    @Override
    public void acc() {
        System.out.println("Acc. Electic Engine");
    }

}
