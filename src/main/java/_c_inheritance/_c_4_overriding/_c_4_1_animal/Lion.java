package _c_inheritance._c_4_overriding._c_4_1_animal;

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