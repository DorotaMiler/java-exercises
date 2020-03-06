package _e_interfaces_plus_super._e_2_Animals;

public class Cat implements Animal {
    final int NUMBER_OF_PAWS = 4;
    String name;

    public void miaus() {
        System.out.println("Cat miaus");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats mice.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}