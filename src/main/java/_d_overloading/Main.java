package _d_overloading;

public class Main {
    public static void main(String[] args) {
        displayName();
        displayName("Dorota");
    }

    private static void displayName() {
        System.out.println("Monika");
    }

    private static void displayName(String name){
        System.out.println(name);
    }

}
