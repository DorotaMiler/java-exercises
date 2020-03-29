package _b_inheritance._b_5_super_and_this._b_5_2_animals;

public class Animal {
    private String name;

    Animal() {
    }

    Animal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Animals are able to move");
    }

    public void printName(){
        System.out.println("name");
    }

    public String getName() {
        return name;
    }
}