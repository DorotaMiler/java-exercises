package _e_interfaces_plus_super._e_2_Animals;

public class Dog implements Animal {

    public void bark() {
        System.out.println("Dog barks!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats red meat.");
    }
}