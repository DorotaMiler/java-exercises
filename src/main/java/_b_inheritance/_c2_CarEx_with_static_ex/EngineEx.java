package _b_inheritance._c2_CarEx_with_static_ex;

public class EngineEx {
    public String engineName;
    private Integer power;
    private Integer capacity;

    public EngineEx() {
        engineName = "default";
        power = 10;
        capacity = 10;
    }

    public EngineEx(Integer power, Integer capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }
}