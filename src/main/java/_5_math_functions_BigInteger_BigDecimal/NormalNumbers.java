package _5_math_functions_BigInteger_BigDecimal;

public class NormalNumbers {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 4;
        double c = 0.33;
        System.out.println("Calculation of a, b & c = " + (a / b * c)); // not precise result due
        // to a fact that doubles are only rounded numbers

        Integer d = 2 * 30;
        Double e = d + c;
        System.out.println(e);
        e += 10;
        System.out.println(d);
        System.out.println(e);
    }
}
