package _b_inheritance._b_5_super_and_this._b_5_2_animals;

public class Dog extends Animal {

    Dog(String name) {

        //  can use this or super only once in constructor
        //  also this cannot be followed by super and vise versa
        //  -> choose one of them
        super(name);
    }

    Dog() {
        //  this should be ALWAYS the first statement!
        //  - otherwise error
        this(4);
        this("test");
    }

    Dog(int legs) {
        System.out.println("Dog has " + legs + " legs.");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Dogs are able to move.");
    }
}