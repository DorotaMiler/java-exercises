package _j_abstract_methods;

import com.sun.xml.internal.ws.api.pipe.Engine;

public abstract class Vehicle {

    private int numberOfWheels;
    private Engine engine;

    public Vehicle(Engine engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
    }
}
