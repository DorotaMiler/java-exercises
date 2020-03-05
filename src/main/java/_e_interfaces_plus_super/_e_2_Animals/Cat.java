package _e_interfaces_plus_super._e_2_Animals;

public class Cat implements Animal{

    public void miaus(){
        System.out.println("Cat miaus");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats mice.");
    }

}