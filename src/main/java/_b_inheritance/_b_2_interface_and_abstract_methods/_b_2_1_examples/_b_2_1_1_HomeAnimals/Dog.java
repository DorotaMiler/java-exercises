package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_1_HomeAnimals;

import java.time.Duration;

public class Dog extends AbstractAnimal implements Animal {

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

    @Override
    void allAnimlsLive() {
        System.out.println("Dogs live one happy life.");
    }
}