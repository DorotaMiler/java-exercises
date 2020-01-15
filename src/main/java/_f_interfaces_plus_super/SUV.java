package _f_interfaces_plus_super;

public class SUV extends Car{
    @Override
    public void startEngine() {
        System.out.println("Force driver to fasten seatbelts in suv!");
    }

    @Override
    public void stop(){
        System.out.println("Suv has stopped");
    }
}