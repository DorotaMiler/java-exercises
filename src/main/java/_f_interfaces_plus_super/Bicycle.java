package _f_interfaces_plus_super;

public class Bicycle implements Vehicle {
    int velocity = 15;

    @Override
    public void move(int velocity) {
        this.velocity = velocity;
        System.out.println();

    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }

    public void jump() {
        System.out.println("Bicycle jump: HIGH in the air!");
    }
}
