package _j_abstract_methods;

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
}