package _2_data_types_and_casting._2_1_variables._2_1_1_static_variable;

public class Car {
    private String make;
    private String engine;

    // ->  will get memory only once and retain its value

    //  -> Static variables are initialized only once, at
    //  the start of the execution. These variables will
    //  be initialized first, before the initialization of
    //  any instance variables

    //  -> A single copy to be shared by all instances of
    //  the class

    public static int numberOfCars;

    public Car(String make, String engine) {
        this.make = make;
        this.engine = engine;
        numberOfCars++;  //incrementing the value of static variable
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

Class

if Insatnce ==null{
    new Instance
        }