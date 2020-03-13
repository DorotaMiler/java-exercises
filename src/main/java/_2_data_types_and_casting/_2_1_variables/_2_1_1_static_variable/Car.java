package _2_data_types_and_casting._2_1_variables._2_1_1_static_variable;

public class Car {
    private String make;
    private String engine;

    private static int numberOfCars;

    public Car(String make, String engine){
        this.make = make;
        this.engine = engine;
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // getters and setters
}
