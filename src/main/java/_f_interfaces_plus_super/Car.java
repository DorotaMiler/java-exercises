package _f_interfaces_plus_super;

public class Car implements Vehicle {

    @Override
    public void move(int velocity) {
        super.move();
    }

    @Override
    public void stop() {
        super.stop();
    }

    public void drift() {
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Engine starts.Brum brum burm.");
    }
}
