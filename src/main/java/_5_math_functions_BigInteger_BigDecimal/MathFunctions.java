package _5_math_functions_BigInteger_BigDecimal;

//  sqrt(double number)  -> radical (pierwiastek)
//  pow(double a, double b)  -> power (potega) result = a powered to b
//  abs(number)  -> absolute value of any number

// more functions:  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html

import static java.lang.Math.*;

/* class Math -> all methods are static (no Object required)
Math.method_name(arguments)
 */
public class MathFunctions {
    public static void main(String[] args) {
        double a = 9.0;
        int b = 3;
        double sqrt = sqrt(a);
        double power = pow(a, b);

        System.out.println("radical from " + a + " = " + sqrt);
        System.out.println("Number " + a + " powered to " + b + " = " + power);

        // liczba PI  -> Math.PI
        // Liczba E  -> Math.E

    }
}
