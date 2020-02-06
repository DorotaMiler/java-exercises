package _c_inheritance._c2_CarEx_with_static_ex;

public class CarEx {

    private EngineEx engine;
    private String name;
    private Integer maxSpeed;
    private Integer variavleInteger = 4;
    private int variableInt = 4;
    private int mileage;

    public CarEx() {
    }

    public CarEx(String name) {
        this.name = name;
    }

    public CarEx(EngineEx engine) {
        this.engine = engine;
    }

    //    2nd concept:
    public CarEx(String name, EngineEx engine) {
        this.name = name;
        this.engine = engine;
    }

    public CarEx(String name, Integer maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
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

    public int getVariableInt() {
        return variableInt;
    }

    public Integer getVariavleInteger() {
        return variavleInteger;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void compareMaxSpeed(CarEx car1, CarEx car2) {
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            System.out.println(car1.getName());
        } else {
            System.out.println(car2.getName());
        }
    }

    public static void renameFasterCar(CarEx car1, CarEx car2) {
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            String a = car1.getName();
            car1.setName("faster car");
            System.out.println(a + " is a " + car1.getName());
        } else {
            String a = car2.getName();
            car2.setName("faster car");
            System.out.println(a + " is a " + car2.getName());
        }
    }

    // the same as reameFasterCar() with if but switch utilization:
    public static void renameFasterCarSwitchV(CarEx car1, CarEx car2) {
        boolean firstCar = car1.getMaxSpeed() > car2.getMaxSpeed();
        switch (firstCar) {
            case 1:
                car1.setName("faster car");
                break;
            default:
                car2.setName("Faster car");
        }
    }
}