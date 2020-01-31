package _c_inheritance._c2_Car;

public class Engine {
    private Integer power;
    private Integer capacity;


    public Engine(){
        power = 10;
        capacity = 10;
    }

    public Engine(Integer power, Integer capacity){
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
