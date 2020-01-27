package _j_abstract_methods;

import java.util.Objects;

public class Engine {

    private Integer power;
    private Integer capacity;
    private String name;
    private String name1 = "Inline";
    private String name2 = "VR";
    private String name3 = "Boxer";

    public Engine(){
        name = "default";
        power = 100;
        capacity = 200;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
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
                Objects.equals(name, engine.name) &&
                Objects.equals(getName1(), engine.getName1()) &&
                Objects.equals(getName2(), engine.getName2()) &&
                Objects.equals(getName3(), engine.getName3());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower(), getCapacity(), name, getName1(), getName2(), getName3());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                '}';
    }
}