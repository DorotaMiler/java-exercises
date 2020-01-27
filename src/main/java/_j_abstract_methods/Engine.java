package _j_abstract_methods;

public class Engine {

    private Integer power;
    private Integer capacity;

    private String inline = "Inline";
    private String vr = "VR";
    private String boxer = "Boxer";

    public String getBoxer() {
        return boxer;
    }

    public String getInline() {
        return inline;
    }

    public String getVr() {
        return vr;
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