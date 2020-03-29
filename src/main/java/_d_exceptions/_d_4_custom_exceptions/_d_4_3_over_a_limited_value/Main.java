package _d_exceptions._d_4_custom_exceptions._d_4_3_over_a_limited_value;

public class Main {
    public static void main(String[] args) {
        try {
            new Calculate().calculate(13);
            new Calculate().calculate(2);
        } catch (LimitException e) {
            System.out.println(e);
        }
    }
}