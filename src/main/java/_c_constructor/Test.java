package _c_constructor;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        System.out.println("Coordinates of object 'point' are: ");
        System.out.println("x: " + point.x);
        System.out.println("y: " + point.y);

        Point point1 = new Point(point);
        System.out.println("\nCoordinates of object 'point1' are: ");
        System.out.println("x: " + point1.x);
        System.out.println("y: " + point1.y);

        Point point2 = point;

        point2.x = 34;
        point2.y = 43;

        System.out.println("\nCoordinates of object 'point2' are: ");
        System.out.println("x: " + point2.x);
        System.out.println("y: " + point2.y);

        System.out.println("\nAGAIN (for comparison) Coordinates of object 'point' are: ");
        System.out.println("x: " + point.x);
        System.out.println("y: " + point.y);

        point2.setPoint(8,9);
        System.out.println("\nAfter setPoint() point2's coordinates:");
        System.out.println("x2: " + point2.x);
        System.out.println("y2: " + point2.y);
    }
}
