package _f_interfaces_plus_super;

public class SUV extends Car{
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Force driver to fasten seatbelts!");

    }
}
