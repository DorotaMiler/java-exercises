package _f_interfaces_plus_super;

public class Car implements Vehicle {

    private int velocity;
    private int tankCapacity = 60;
    // @ the beginnign of a ride:
    private int fuelLevel = tankCapacity;
    private int toFill;

    public void fillTank() {
        int toFill = tankCapacity - fuelLevel;
        fillTank(toFill);
    }

    public void fillTank(int toFill) {
        if (toFill + fuelLevel > tankCapacity) {
            System.out.println("Tank capacity exceeded -> please rethink " + toFill + " litres fuel's amount");
        } else {
            fuelLevel += toFill;
            System.out.println("Tank has been successfully filled with " + toFill + " litres of fuel");
        }
    }

    @Override
    public void move(int velocity) {
        this.velocity = velocity;
        System.out.println("A car moves with an average velocity: " + velocity);
    }

    @Override
    public void stop() {
        System.out.println("A car has stopped.");
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

    public void drift() {
        System.out.println("A car has drifted!");
    }
}