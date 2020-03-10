package _e_enum._e_2_Colour;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Colour red = Colour.RED;
        Make make = Make.AUDI;
        System.out.println("Car's colour is (using enums filed): " + car.getColour(Colour.RED));
        System.out.println("Car's colour is (using Colour as an object -> colour): " + car.getColour(red).toString().toLowerCase() + "; its make is: " + car.getMake(make).toString().toLowerCase());
    }
}