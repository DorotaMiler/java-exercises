package _b_object_programming.Coordinates;

public class SetAPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.coordinatesX = 10;
        point.coordinatesY = 20;
        System.out.println("Point's coordinates are: (" + point.coordinatesX + ", " + point.coordinatesY + ")");
    }
}
