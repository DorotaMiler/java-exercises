package _j_abstract_methods;

import java.util.Date;
import java.util.Objects;

public class Car extends Vehicle {

    private String name;
    private int maxSpeed;
    private Engine engine;
    private Colour colour;

    public Car(){
    }

    public Car() {
        name = "default";
        maxSpeed = 100;
        engine = new Engine();
        colour = Colour.WHITE;
    }

    public Car(String name, int maxSpeed, Engine engine, Colour colour){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.colour = colour;
    }

//    public Car(String name, Integer maxSpeed, Engine engine, Colour colour) {
//        this.name = name;
//        this.maxSpeed = maxSpeed;
//        this.engine = engine;
//        this.colour = colour;
//    }

    public void printName() {
        String intro = "The car's name is: ";
        System.out.println(intro);
        System.out.println(name);
    }

//    public Car(Engine engine) {
//        super(engine, NUMBER_OF_WHEELS);
//    }

    @Override
    public static int getNumberOfWheels() {
        return NUMBER_OF_WHEELS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Colour getColour() {
        return colour;
    }

    @Override
    public Date getProducionDate() {
        return super.getProducionDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getMaxSpeed() == car.getMaxSpeed() &&
                Objects.equals(getName(), car.getName()) &&
                Objects.equals(getEngine(), car.getEngine()) &&
                colour == car.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMaxSpeed(), getEngine(), colour);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engine=" + engine +
                ", colour=" + colour +
                '}';
    }
}