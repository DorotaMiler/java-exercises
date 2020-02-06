package _c_inheritance._c_4_overriding._c_4_1_animal;

public class Elephant extends Animal {

    @Override
    public void setName(String name) {

    }

    @Override
    public void eat(double weight) {
        // 1st attempt:
        super.eat(weight/2);
    }

    @Override
    public void growOld(int age) {
        super.growOld(age/3);
    }
}
