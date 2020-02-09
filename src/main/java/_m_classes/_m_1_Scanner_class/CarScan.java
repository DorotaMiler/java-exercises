package _m_classes._m_1_Scanner_class;

public class CarScan {
    private String make;
    private int maxSpeed;

    public CarScan() {
    }

    public CarScan(String make, int maxSpeed) {
        this.make = make;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getMake() {
        return make;
    }

}