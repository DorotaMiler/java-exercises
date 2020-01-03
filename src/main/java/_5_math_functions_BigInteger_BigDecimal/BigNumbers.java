package _5_math_functions_BigInteger_BigDecimal;

/*
BigInteger
BigDecimal

useful constants are concluded:
BigInteger.ONE / BigDecimal.ONE
BigInteger.ZERO / BigDecimal.ZERO
 */

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger bigNumber = new BigInteger("123");  /* argument as a String variable type
                                                              constructor accepts String, not int or long
                                                              */
        //  another way to create object:
        //  BigInteger bigNumber = BigInteger.valueOf(1234567890)
        System.out.println("bigNumber = "+bigNumber);
    }
}
