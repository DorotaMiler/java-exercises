package _e_interfaces_plus_super._e_2_Animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();
        dog.name("Pluto");
        System.out.println(dog.name);
        cat.eat();
        cat.miaus();
        cat.name("Klakier");
        System.out.println(cat.name);

    }
}