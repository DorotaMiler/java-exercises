package _a_object_programming._a_1_basic_method_arguments_and_fields;

public class Point {
    int coordinatesX;
    int coordinatesY;

    void setX(int x) {
        coordinatesX = x;
    }

    void setY(int y) {
        coordinatesY = y;
    }

    int returnX() {
        return coordinatesX;
    }

    int returnY() {
        return coordinatesY;
    }

    public void runPointChange() {
        Point point = new Point();
        point.coordinatesX = 10;
        point.coordinatesY = 100;
        change(point);
        System.out.println("point's x coordinates after a runPointChange(): " + point.coordinatesX);
        System.out.println("point's y coordinates after a runPointChange(): " + point.coordinatesY);
    }

    public void change(Point p) {
        //  p= new Point();
        p.coordinatesX = 99;
        p.coordinatesY = 91;
    }
}