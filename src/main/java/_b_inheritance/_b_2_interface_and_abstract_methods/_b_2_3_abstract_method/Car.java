package _b_inheritance._b_2_interface_and_abstract_methods._b_2_3_abstract_method;

import java.util.Date;
import java.util.Objects;

public class Car extends Vehicle {
    private String name;
    private int maxSpeed;
    private int year;
    private Engine engine;
    private Colour colour;

    public Car() {
        name = "default";
        maxSpeed = 100;
        engine = new Engine(1, 1);
        colour = Colour.WHITE;
    }

    public Car(String name, int maxSpeed, Engine engine, Colour colour, int year) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.colour = colour;
        this.year = year;

        static class CarBuilder {
            private String name;
            private int maxSpeed;
            private int year;
            private Engine engine;
            private Colour colour;

            public CarBuilder setName(String name) {
                this.name = name;
                return this;
            }

            public CarBuilder setMaxSpeed(int maxSpeed) {
                this.maxSpeed = maxSpeed;
                return this;
            }

            public CarBuilder setEngine(Engine engine) {
                this.engine = engine;
                return this;
            }

            public CarBuilder setColour(Colour colour) {
                this.colour = colour;
                return this;
            }

            public CarBuilder setYear(int year) {
                this.year = year;
                return this;
            }

            public Car createCar() {
                return new Car(name, maxSpeed, engine, colour, year);
            }
        }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void setProducionDate(Date producionDate) {
        super.setProducionDate(producionDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getMaxSpeed() == car.getMaxSpeed() &&
                getYear() == car.getYear() &&
                Objects.equals(getName(), car.getName()) &&
                Objects.equals(getEngine(), car.getEngine()) &&
                getColour() == car.getColour();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMaxSpeed(), getYear(), getEngine(), getColour());
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