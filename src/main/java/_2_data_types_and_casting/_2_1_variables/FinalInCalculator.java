package _2_data_types_and_casting._2_1_variables;

public class FinalInCalculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("a = b = " + (a + b));

        // final variable example
        final double numberPi = 3.14;
        final int final2;
        final2 = 3;  //  correct - first initiation
        //  numberPi = 8;  // error - variable initiation already done
        FinalExample finalEx = new FinalExample();
        finalEx.simpleMethod();

    }
}
