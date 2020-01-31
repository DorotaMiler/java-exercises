package _c_inheritance._c2_CarEx;

public class CarEx {
    private Engine engine;
    private String name;

    //    2nd concept:
    public CarEx(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
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
