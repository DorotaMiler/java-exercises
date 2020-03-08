package _b_inheritance._b_1_basics._c1_Company._c_4_1_animal;

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