package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_1_HomeAnimals;

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

        try {
            dog.takeCareOfAnimals(5);
        }catch(DaysOverLimitException e){
            System.out.println(e.getMessage());
        }

        cat.eat();
        cat.miaus();
        cat.name="Klakier";
        System.out.println(cat.name);
        try {
            cat.takeCareOfAnimals(4);
        }catch(DaysOverLimitException e){
            System.out.println(e.getMessage());
        }
    }
}