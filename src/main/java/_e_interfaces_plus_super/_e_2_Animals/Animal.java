package _e_interfaces_plus_super._e_2_Animals;

import java.time.Duration;

public interface Animal {

    void eat();

    default void coveredDistance(int distanceInKilometers, Duration duration) {
        System.out.println("Animal moved " + distanceInKilometers + " kilometers in " + duration.getSeconds() + " seconds.");
    }
}