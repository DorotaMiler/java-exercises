package _b_inheritance._e_super_and_abstract_methods._e_1_Vehicle;

public class SUV extends Car {

    @Override
    public void startEngine() {
        System.out.println("Force this suv's driver to fasten seat belts.");
    }

    @Override
    public void stop() {
        System.out.println("Suv has stopped.");
    }

    @Override
    public void move(int velocity) {
        System.out.println("Suv moves with average velocity: " + velocity);
    }

    public void speeding(int velocity) {
        System.out.println("Suv is speeding! The velocity of " + velocity + " is unacceptable!");
    }

    @Override
    public void measureVelocity(int velocity) {
        super.measureVelocity(velocity);
    }
}