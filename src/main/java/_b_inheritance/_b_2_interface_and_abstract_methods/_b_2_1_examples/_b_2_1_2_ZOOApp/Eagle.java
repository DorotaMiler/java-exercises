package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_2_ZOOApp;

public class Eagle extends Animal implements Herbivore, Carnivore{
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

    @Override
    public void eatMeat(double weight) {

    }

    @Override
    public void eatPlant(double weight) {

    }
}