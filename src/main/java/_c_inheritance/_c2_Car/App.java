package _c_inheritance._c2_Car;

public class App {
    public static void main(String[] args) {

        // 1st concept:
//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        car1.setName("Toyota");
//        car1.setEngine(new Engine(100,200));
//        System.out.println("First car's features: "+car1.getName()+", engine: capacity -> "+ car1.getEngine().getCapacity()+", power: "+car1.getEngine().getPower());
//
//        car2.setName("Opel");
//        car2.setEngine(new Engine(120,250));
//        System.out.println("Second car's features: "+car2.getName()+", engine: capacity -> "+ car2.getEngine().getCapacity()+", power: "+car2.getEngine().getPower());


        // 2nd concept (saves space):
        Car car1 = new Car("Toyota", new Engine(400, 270));
        System.out.println("Thanks to constructors, first car's features are: " + "\nName: " + car1.getName() + "\n capacity: " + car1.getEngine().getCapacity() + "\n power: " + car1.getEngine().getPower());

        Car car2 = new Car("Opel", new Engine(500, 230));
        System.out.println("Again, thnks to constructors, first car's features are: " + "\nName: " + car2.getName() + "\n capacity: " + car2.getEngine().getCapacity() + "\n power: " + car2.getEngine().getPower());
    }
}