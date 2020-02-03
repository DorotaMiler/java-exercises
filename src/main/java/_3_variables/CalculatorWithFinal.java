package _3_variables;

public class CalculatorWithFinal {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("a = b = " + (a + b));

        // final variable example
        final double numberPi = 3.14;
        final int final2;
        final2 = 3;  //  correct - first initiation
        //  numberPi = 8;  // error - variable initiation already done
        FinalEx finalEx = new FinalEx();
        finalEx.simpleMethod();

    }
}
