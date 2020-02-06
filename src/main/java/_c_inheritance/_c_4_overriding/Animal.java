package _c_inheritance._c_4_overriding;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void eat(double weight) {
        this.weight += 1 / 4 * weight;
        System.out.println("Animal eats and gets bigger so now weights: " + getWeight());
    }

    public void growOld(int age) {
        this.age += age;
    }
}