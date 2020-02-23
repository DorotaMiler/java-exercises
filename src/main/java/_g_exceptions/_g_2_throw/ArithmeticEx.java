package _g_exceptions._g_2_throw;

public class ArithmeticEx {
    public static void main(String[] args) {

        try {
            System.out.println("Equation result: " + devide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Not possible to divide by 0.");
        }
    }

    private static int devide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

// 1st approach
//    private static int divide(int a, int b) {
//        try {
//            System.out.println("Do the math a/b : " + "\n" + a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("Operation not possible due to arithmetic error");
//        }
//        return a / b;
//    }

// not keen of this dispay in console so 2nd approach below
// 2nd approach: