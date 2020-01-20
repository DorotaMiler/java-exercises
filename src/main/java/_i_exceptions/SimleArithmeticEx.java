package _i_exceptions;

public class SimleArithmeticEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println(divide(4, 2));
    }

    // 1st approach
    private static int divide(int a, int b) {
        try {
            System.out.println("Do the math a/b : " + "\n" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Operation not possible due to arithmetic error");
        }
        return a / b;
    }
}
// not keen of this dispay in console so 2nd approach below
// 2nd approach: