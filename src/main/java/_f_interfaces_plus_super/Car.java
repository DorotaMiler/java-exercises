package _f_interfaces_plus_super;

public class Car implements Vehicle {

    int velocity;

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
        System.out.println("Car's engine starts.Brum brum burm.");
    }

    @Override
    public void measureVelocity(int velocity) {
        if (velocity < 100) {
            return;
        }
        System.out.println("Velocity measured as HIGH!");
    }
}