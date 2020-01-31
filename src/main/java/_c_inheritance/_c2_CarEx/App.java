package dm.vehicle;

import _c_inheritance._c2_CarEx.CarEx;

public class App {
    public static void main(String[] args) {
        // 1st concept:
//        CarEx car1 = new CarEx();
//        CarEx car2 = new CarEx();
//
//        car1.setName("Toyota");
//        car1.setEngine(new Engine(100,200));
//        System.out.println("First car's features: "+car1.getName()+", engine: capacity -> "+ car1.getEngine().getCapacity()+", power: "+car1.getEngine().getPower());
//
//        car2.setName("Opel");
//        car2.setEngine(new Engine(120,250));
//        System.out.println("Second car's features: "+car2.getName()+", engine: capacity -> "+ car2.getEngine().getCapacity()+", power: "+car2.getEngine().getPower());

        // 2nd concept (saves space):
        CarEx car1 = new CarEx("Toyota", new Engine(400, 270));
        System.out.println("Thanks to constructors, first car's features are: " + "\nName: " + car1.getName() + "\n capacity: " + car1.getEngine().getCapacity() + "\n power: " + car1.getEngine().getPower());

        CarEx car2 = new CarEx("Opel", new Engine(500, 230));
        System.out.println("Again, thanks to constructors, second car's features are: " + "\nName: " + car2.getName() + "\n capacity: " + car2.getEngine().getCapacity() + "\n power: " + car2.getEngine().getPower());

        // 1st approach:
        //  car1.printCarName("Mercedes");
//2nd appoach:
//        car2.printCarName();

//        3rd approach:
//        car1.printCarName();
        CarEx.printCarName("Mazda");
    }
}