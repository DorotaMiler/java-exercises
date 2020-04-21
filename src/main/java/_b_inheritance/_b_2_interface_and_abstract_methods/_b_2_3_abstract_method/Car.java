package _b_inheritance._b_2_interface_and_abstract_methods._b_2_3_abstract_method;

import java.util.Objects;

public class Car extends Vehicle {
    private final String name;
    private final int maxSpeed;
    private final int year;
    private final Engine engine;
    private final Colour colour;

//    public Car() {
//        name = "default";
//        maxSpeed = 100;
//        engine = new Engine(1, 1);
//        colour = Colour.WHITE;
//    }

    private Car(CarBuilder builder) {
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.engine = builder.engine;
        this.colour = builder.colour;
        this.year = builder.year;
    }

    public void printName() {
        String intro = "The car's name is: ";
        System.out.println(intro);
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    public Colour getColour() {
        return colour;
    }

    public int getYear() {
        return year;
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
                ", year=" + year +
                ", engine=" + engine +
                ", colour=" + colour +
                '}';
    }

    public Car createCar() {
        return new Car(name, maxSpeed, engine, colour, year);
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

    public static class CarBuilder {
        private final String name;
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

    }
}