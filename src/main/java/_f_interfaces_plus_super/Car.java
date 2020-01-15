package _f_interfaces_plus_super;

public class Car implements Vehicle {
    int velocity = 60;

    @Override
    public void move(int velocity) {
        this.velocity = velocity;
        System.out.println("A car moves with an average velocity: " + velocity);
    }

    @Override
    public void stop() {
        System.out.println("A car has stopped.");
    }

    public void drift() {
        System.out.println("A car has drifted!");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starts.Brum brum burm.");
    }
}