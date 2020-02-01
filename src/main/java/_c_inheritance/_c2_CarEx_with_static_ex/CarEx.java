package dm.vehicle;

public class CarEx {
    private Engine engine;
    private String name;


    public CarEx(String name) {
        this.name = name;
    }

    //    2nd concept:
    public CarEx(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

//    1st approach:
//    public void printCarName(String name) {
//        this.name = name;
//        System.out.println("Car's name is: " + name);
//    }

//    2nd approach
//    public void printCarName() {
//        System.out.println("Car's name is: " + name);
//    }

    public static void printCarName(String name) {
        CarEx car = new CarEx(name);
        System.out.println(car.getName());
    }


    // 1st concept:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}