package _j_abstract_methods;

public abstract class Vehicle {

    private int numberOfWheels;
    private Engine engine;

    public Vehicle(Engine engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public Engine getEngine() {
        return engine;
    }
}
