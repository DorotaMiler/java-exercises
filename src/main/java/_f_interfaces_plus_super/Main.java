package _f_interfaces_plus_super;

public class Main {
    public static void main(String[] args) {
        SUV suv = new SUV();
        suv.startEngine();
        suv.stop();
        suv.move(135);
        suv.speeding(160);
        suv.measureVelocity(100);

        Car car = new Car();
        System.out.println("\n");
        car.startEngine();
        car.stop();
        car.move(20);
        car.drift();
        car.measureVelocity(40);
        car.fillTank(20);

        Bicycle bicycle = new Bicycle();
        System.out.println("\n");
        bicycle.startEngine();
        bicycle.stop();
        bicycle.move(10);
        bicycle.jump();
        bicycle.measureVelocity(15);
    }
}