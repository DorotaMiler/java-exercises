package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_2_ZOOApp;

public class Lion extends Animal implements Carnivore{

    public Lion(){
    }

    public Lion(String name){
        super.setName(name);
        System.out.println("Lion called "+name+" created.");
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public void eat(double weight) {
    }

    @Override
    public void growOld(int age) {
    }

    @Override
    public void eatMeat(double weight) {

    }
}