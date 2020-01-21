package _i_exceptions._i2_throw;

public class Practice {

    public static void main(String[] args) {
        try {
            System.out.println("Equation result: "+divide(23, 45.5));
        } catch (ArithmeticException e) {
            System.out.println("Please do not devise by 0!");
        }
    }

    private static double divide(int a, double b)throws ArithmeticException{
    return a/b;
    }
}