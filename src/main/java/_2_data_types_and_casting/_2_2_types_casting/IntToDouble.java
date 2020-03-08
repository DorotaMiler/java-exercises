package _2_data_types_and_casting._2_2_types_casting;

public class IntToDouble {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        double result = a / b;
        System.out.println(result);

        double c = (double) a;
        double d = (double) b;
        double result1 = c / d;
        System.out.println(result1);
    }
}