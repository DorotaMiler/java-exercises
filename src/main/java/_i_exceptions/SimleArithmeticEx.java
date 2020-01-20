package _i_exceptions;

public class SimleArithmeticEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("Do the math a/b : " + "\n" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Operation not possible due to arithmetic error");
        }
    }
}