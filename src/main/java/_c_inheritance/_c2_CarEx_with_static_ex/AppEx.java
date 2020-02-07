package _c_inheritance._c2_CarEx_with_static_ex;

public class AppEx {
    public static void main(String[] args) {
        // 1st concept:
//        CarEx car1 = new CarEx();
//        CarEx car2 = new CarEx();
//
//        car1.setName("Toyota");
//        car1.setEngine(new EngineEx(100,200));
//        System.out.println("First car's features: "+car1.getName()+", engine: capacity -> "+ car1.getEngine().getCapacity()+", power: "+car1.getEngine().getPower());
//
//        car2.setName("Opel");
//        car2.setEngine(new EngineEx(120,250));
//        System.out.println("Second car's features: "+car2.getName()+", engine: capacity -> "+ car2.getEngine().getCapacity()+", power: "+car2.getEngine().getPower());


        // default execution:
        CarEx car = new CarEx(new EngineEx());
        System.out.println("Default engine info: default name-> " + car.getEngine().engineName + ", capcity-> " + car.getEngine().getCapacity() + ", power-> " + car.getEngine().getPower());

        // 2nd concept (saves space):
        CarEx car1 = new CarEx("Toyota", new EngineEx(400, 270));
        System.out.println("Thanks to constructors, first car's features are: " + "\nName: " + car1.getName() + "\n capacity: " + car1.getEngine().getCapacity() + "\n power: " + car1.getEngine().getPower());

        CarEx car2 = new CarEx("Opel", new EngineEx(500, 230));
        System.out.println("Again, thanks to constructors, second car's features are: " + "\nName: " + car2.getName() + "\n capacity: " + car2.getEngine().getCapacity() + "\n power: " + car2.getEngine().getPower());

        // 1st approach:
        //  car1.printCarName("Mercedes");
//2nd appoach:
//        car2.printCarName();

//        3rd approach:
//        car1.printCarName();
        CarEx.printCarName("Mazda");
        System.out.println("\n");
        StaticEx.staticMethod();

        StaticEx staticExample = new StaticEx();
        staticExample.nonStaticMethod();

        CarEx car3 = new CarEx("Toyota", new EngineEx(400, 270));
        car3.setName("Mercedes");
        car3.setEngine(new EngineEx(30, 40));
        System.out.println("\nThird car's features: " + "\n name: " + car3.getName() + "\n power: " + car3.getEngine().getPower() + "\n capacity: " + car3.getEngine().getCapacity());

        CarEx car4 = new CarEx("Ferrari", new EngineEx(50, 500));
        System.out.println("Fourth car's features: " + "\n name: " + car4.getName() + "\n power: " + car4.getEngine().getPower() + "\n capacity: " + car4.getEngine().getCapacity());

        CarEx car5 = new CarEx("Toyota", new EngineEx(400, 270));
        car5.setName("Ford");
        EngineEx engine5 = new EngineEx();
        engine5.setPower(60);
        engine5.setCapacity(600);
        car5.setEngine(engine5);
        car5.setMileage(1345);
        System.out.println("Fifth car's features: " + "\n name: " + car5.getName() + "\n power: " + car5.getEngine().getPower() + "\n capacity: " + car5.getEngine().getCapacity() + "\n mileage: " + car5.getMileage());

// 1st approach -> comparison of int & Integer:
        boolean comparison1 = car1.getVariableInt() == car1.getVariavleInteger();
        System.out.println("Comparison of int & Integer methods: " + comparison1);
        //true

        // 2nd approach -> comparison of int & Integer:
        System.out.println(Integer.compare(car1.getVariableInt(), car1.getVariavleInteger()));
        // println "0" -> therefore true

        CarEx car6 = new CarEx("car6", 100);
        CarEx car7 = new CarEx("car7", 200);
        CarEx car8 = new CarEx("car8", 500);
        CarEx.compareMaxSpeed(car6, car7);

        CarEx.renameFasterCar(car6, car7);
        System.out.println(car6.getName());
        System.out.println(car7.getName());

        CarEx.renameFasterCarWithSwitch(car7, car8);
    }
}