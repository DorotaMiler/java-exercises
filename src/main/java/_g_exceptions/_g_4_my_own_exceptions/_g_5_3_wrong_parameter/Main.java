package _g_exceptions._g_4_my_own_exceptions._g_5_3_wrong_parameter;

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