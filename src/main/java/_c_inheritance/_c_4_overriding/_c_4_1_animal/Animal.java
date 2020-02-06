package _c_inheritance._c_4_overriding._c_4_1_animal;

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