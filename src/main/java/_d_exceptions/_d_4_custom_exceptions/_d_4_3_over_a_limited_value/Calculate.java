package _d_exceptions._d_4_custom_exceptions._d_4_3_over_a_limited_value;

public class Calculate {

    public void calculate(int value) throws LimitException {
        if(a>10){
            throw new LimitException(value);
            System.out.println("No error in program. No exception caught.");
        }
    }
}
