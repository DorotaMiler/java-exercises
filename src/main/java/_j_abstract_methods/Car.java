package _j_abstract_methods;

public class Car extends Vehicle {
    private static final int NUMBER_OF_WHEELS = 4;

    public Car(Engine engine) {
        super(engine, NUMBER_OF_WHEELS);
    }
}
