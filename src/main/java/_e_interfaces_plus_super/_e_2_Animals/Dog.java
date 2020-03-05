package _e_interfaces_plus_super._e_2_Animals;

public class Dog implements Animal {

    String name;

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
}