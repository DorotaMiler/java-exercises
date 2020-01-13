package _b_object_programming.Coordinates._1_methods_arguments;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        int a = 1;
        int b = 2;
        int c = 3;
        double d = 4.0;
        double result = addMultiple(a, b, c, d);
        System.out.println("run() -> result = " + result);
        System.out.println("run() -> a = " + a);
        System.out.println("run() -> a = " + b);
        System.out.println("run() -> a = " + c);
    }

    private int add(int a, int b, int c) {
        a = 10;
        return a + b + c;
    }

    private double addMultiple(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}