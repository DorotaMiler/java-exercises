package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_1_HomeAnimals;

import java.time.Duration;

public class Cat extends AbstractAnimal implements Animal {
    final int NUMBER_OF_PAWS = 4;
    String name;

    public void miaus() {
        System.out.println("Cat miaus");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats mice.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void coveredDistance(int distanceInKilometers, Duration duration) {
        System.out.println("Cat moved " + distanceInKilometers + " kilometers in " + duration.getSeconds() + " seconds.");
    }

    @Override
    void allAnimlsLive() {
        System.out.println("Cats live 9 lives.");
    }


}