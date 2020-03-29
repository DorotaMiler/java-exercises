package _d_exceptions._d_4_custom_exceptions._d_4_3_over_a_limited_value;

public class Main {
    public static void main(String[] args) {
        try {
            calculate(13);
            calculate(4);
        } catch (LimitException e) {
            System.out.println(e);
        }
    }
}