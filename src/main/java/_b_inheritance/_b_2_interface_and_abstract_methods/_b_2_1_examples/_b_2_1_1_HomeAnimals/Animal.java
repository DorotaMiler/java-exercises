package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_1_HomeAnimals;

import java.time.Duration;

public interface Animal {

    void eat();

    default void coveredDistance(int distanceInKilometers, Duration duration) {
        System.out.println("Animal moved " + distanceInKilometers + " kilometers in " + duration.getSeconds() + " seconds.");
    }
}