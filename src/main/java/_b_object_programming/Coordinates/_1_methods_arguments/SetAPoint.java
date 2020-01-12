package _b_object_programming.Coordinates._1_methods_arguments;

import _b_object_programming.Coordinates._1_methods_arguments.Point;

public class SetAPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.coordinatesX = 10;
        point.coordinatesY = 20;
        point.setX(13);
        point.setY(23);
        // System.out.println("Point's coordinates are: (" + point.coordinatesX + ", " + point.coordinatesY + ")");
        System.out.println("Point's coordinates are: (" + point.returnX() + ", " + point.returnY() + ")");

        System.out.println("New point's coordinates are: (" + point.returnX() + ", " + point.returnY() + ")");
    }
}
