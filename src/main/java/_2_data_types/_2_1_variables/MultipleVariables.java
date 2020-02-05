package _2_data_types._2_1_variables;

public class MultipleVariables {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = number1;
        System.out.println("Sum of number1 & number2 = " + (number1 + number2)); // 10
        number1 = 10;
        System.out.println("number2 = " + number2); // 5 ; number2 = number1 is a one time action

        double number3, number4;
        number3 = 5.0;
        number4 = 3.3;
        System.out.println("number3 = " + number3);  // 5.0
        System.out.println("number4 = " + number4);  // 3.3
    }
}
