package _f_interfaces_plus_super;

public class Bicycle implements Vehicle {
    int velocity = 15;

    @Override
    public void move(int velocity) {
        this.velocity = velocity;
        System.out.println("Bicycle moves with velocity: " + velocity);
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starts.Let's pedal Mevo!");
    }

    public void jump() {
        System.out.println("Bicycle jump: HIGH in the air!");
    }
}