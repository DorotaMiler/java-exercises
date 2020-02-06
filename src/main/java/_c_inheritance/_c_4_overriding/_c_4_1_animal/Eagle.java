package _c_inheritance._c_4_overriding._c_4_1_animal;

public class Eagle extends Animal {
    @Override
    public void setName(String name) {
    }

    @Override
    public void eat(double weight) {
        super.eat(weight);
    }

    @Override
    public void growOld(int age) {

    }
}