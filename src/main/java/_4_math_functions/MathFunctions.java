package _4_math_functions;

import static java.lang.Math.*;

//  sqrt(double number)  -> radical (pierwiastek)
//  pow(double a, double b)  -> power (potega) result = a powered to b
//  abs(number)  -> absolute value of any number

// more functions:  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html

/* class Math -> all methods are static (no Object required)
Math.method_name(arguments)
 */
public class MathFunctions {
    public static void main(String[] args) {
        double a = 9.0;
        int b = 3;
        int c = -6;
        double sqrt = sqrt(a);
        double power = pow(a, b);
        double abs = abs(c);

        System.out.println("radical from " + a + " = " + sqrt);
        System.out.println("Number " + a + " powered to " + b + " = " + power);
        System.out.println("Number " + c + " and its absolute value (abs(number)) = " + abs);

        // liczba PI  -> Math.PI
        // Liczba E  -> Math.E
    }
}