package _d_overloading;

public class Main {
    public static void main(String[] args) {
        displayName();
        displayName("Dorota");

        System.out.println(add(1, 2));
        System.out.println(add(1, 3.0));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    private static void displayName() {
        System.out.println("Monika");
    }

    private static void displayName(String name) {
        System.out.println(name);
    }

}
