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
        int result = add(a, b, c);
        System.out.println("run() -> result = " + result);
        System.out.println("run() -> a = " + a);
        System.out.println("run() -> a = " + b);
        System.out.println("run() -> a = " + c);
    }

    private int add(int a, int b, int c) {
        a = 10;
        return a + b + c;
    }

}
