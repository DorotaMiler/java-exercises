package _b_inheritance._b_2_interface_and_abstract_methods._b_2_3_abstract_method;

import java.util.Date;

public class Vehicle {

    private static final int NUMBER_OF_WHEELS = 4;
    private Engine engine;
    private Date producionDate;

    public static int getNumberOfWheels() {
        return NUMBER_OF_WHEELS;
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