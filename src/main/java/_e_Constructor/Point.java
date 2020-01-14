package _e_Constructor;

public class Point {
    int x;
    int y;

    public Point(){
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }
    
    public Point(Point point){
        x = point.x;
        y = point.y;
    }
}
