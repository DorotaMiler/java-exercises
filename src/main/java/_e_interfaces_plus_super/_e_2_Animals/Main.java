package _e_interfaces_plus_super._e_2_Animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();
        dog.setName("Pluto");
        System.out.println(dog.getName());
        cat.eat();
        cat.miaus();
        cat.setName("Klakier");
        System.out.println(cat.getName());

    }
}