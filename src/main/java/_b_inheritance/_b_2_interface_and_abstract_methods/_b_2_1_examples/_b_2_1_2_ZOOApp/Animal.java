package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_2_ZOOApp;

/**
 * ->  abstract class - not possible to create abstract class's
 * object (just like there is no 'just' mammal in
 * nature or fish - we have their specific kinds etc,
 */

public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal() {
        System.out.println("Animal without any details is created.");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("An animal named: " + name + " has been created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(double weight) {
        this.weight += 3 * weight / 4;
    }

    public void growOld(int age) {
        this.age += age;
    }
}