package DesignPatterns.facade;

public class CarFacade {

    private Doors doors;
    private Engine engine;
    private Lights lights;

    public CarFacade() {
        this.doors = new Doors();
        this.engine = new Engine();
        this.lights = new Lights();
    }

    public void start() {
        doors.close();
        engine.turnON();
        lights.turnON();
    }
}
