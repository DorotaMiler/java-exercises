package _e_interfaces_plus_super._e_2_Animals;

import java.time.Duration;

public class Dog implements Animal {

    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Dog barks!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats red meat.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void coveredDistance(int distanceInKilometers, Duration duration) {
        Dog dog = new Dog(getName());
        System.out.println("Dog " + dog.getName() + " moved " + distanceInKilometers + " kilometers in " + duration.getSeconds() + " seconds.");
    }

}