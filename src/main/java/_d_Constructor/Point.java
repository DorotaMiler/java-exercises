package _d_Constructor;

public class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

}
