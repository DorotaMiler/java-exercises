package _c_inheritance._c_4_overriding._c_4_1_animal;

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