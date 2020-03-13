package _2_data_types_and_casting._2_1_variables._2_1_1_static_variable;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "Diesel");
        int currentAmount = Car.numberOfCars;
        System.out.println("1st car's info: \n" + " -> make: " + car1.getMake() + "\n -> engine: " + car1.getEngine() + "\n    * current amount of cars in record: " + currentAmount);
        Car car2 = new Car("Toyota", "Petrol");
        currentAmount = Car.numberOfCars;
        System.out.println("2nd car's info: \n" + " -> make: " + car2.getMake() + "\n -> engine: " + car2.getEngine() + "\n    * current amount of cars in record: " + currentAmount);
    }
}