package OOPS.Interfaces;

public class Car implements Engine, Brake{

    @Override
    public void brake() {
        System.out.println("Brake like a normal car.");
    }

    @Override
    public void start() {
        System.out.println("Start Engine like a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine like a normal car.");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate like a normal car.");
    }
    
}
