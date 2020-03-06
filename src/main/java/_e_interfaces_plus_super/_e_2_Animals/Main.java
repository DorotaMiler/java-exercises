package _e_interfaces_plus_super._e_2_Animals;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();
        dog.setName("Pluto");
        dog.coveredDistance(2, Duration.ofDays(3));
        System.out.println(dog.getName());
        cat.eat();
        cat.miaus();
        cat.name="Klakier";
        System.out.println(cat.name);
    }
}