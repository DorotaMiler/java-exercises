package _j_abstract_methods;

import java.util.Objects;

class Engine {

    private Integer power;
    private Integer capacity;
    private String name;

    public Engine() {
        name = "default";
        power = 100;
        capacity = 200;
    }

    public Engine(Integer power, Integer capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Objects.equals(getPower(), engine.getPower()) &&
                Objects.equals(getCapacity(), engine.getCapacity()) &&
                Objects.equals(name, engine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower(), getCapacity(), name);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                '}';
    }
}