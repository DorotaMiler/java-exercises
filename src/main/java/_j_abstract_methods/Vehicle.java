package _j_abstract_methods;

import java.util.Date;

public class Vehicle {

    private static final int NUMBER_OF_WHEELS = 4;
    private Engine engine;
    private Date producionDate;

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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Date getProducionDate() {
        return producionDate;
    }

    public void setProducionDate(Date producionDate) {
        this.producionDate = producionDate;
    }
}