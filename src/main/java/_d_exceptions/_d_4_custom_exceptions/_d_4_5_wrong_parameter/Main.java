package _d_exceptions._d_4_custom_exceptions._d_4_5_wrong_parameter;

public class Main {
    public static void main(String[] args) {
        IntegerNumber number = new IntegerNumber();

        try {
            System.out.println(number.integerRequest());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}