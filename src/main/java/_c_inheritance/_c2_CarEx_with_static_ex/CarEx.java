package _c_inheritance._c2_CarEx_with_static_ex;


import _j_abstract_methods.Engine;

public class CarEx {

    private EngineEx engine;
    private String name;

    public CarEx(){
    }

    public CarEx(String name) {
        this.name = name;
    }

    //    2nd concept:
    public CarEx(String name, EngineEx engine) {
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

    public EngineEx getEngine() {
        return engine;
    }

    public void setEngine(EngineEx engine) {
        this.engine = engine;
    }
}