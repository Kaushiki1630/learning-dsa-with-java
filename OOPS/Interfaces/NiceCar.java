package OOPS.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CdPlayer();

    public NiceCar(){
        engine = new ElectricEngine();
    }

    // public NiceCar(Engine engine){
    //     this.engine= engine;
    // }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine= new PowerEngine();
    }
}
