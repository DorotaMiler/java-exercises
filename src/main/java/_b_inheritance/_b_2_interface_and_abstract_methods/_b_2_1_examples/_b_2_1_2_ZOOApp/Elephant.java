package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_2_ZOOApp;

public class Elephant extends Animal implements Herbivore{

    public Elephant(){
        super();
        System.out.println("Nameless elephant created.");
    }

    public Elephant(String name){
        super(name);
        System.out.println("Elephant called: "+name+" created");
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

    @Override
    public void eatPlant(double weight) {

    }
}