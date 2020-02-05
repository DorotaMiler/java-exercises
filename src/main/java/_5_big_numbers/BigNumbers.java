package _5_big_numbers;

/*
BigInteger
BigDecimal

useful constants are concluded:
BigInteger.ONE / BigDecimal.ONE
BigInteger.ZERO / BigDecimal.ZERO
 */

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger bigNumber = new BigInteger("123");  /* argument as a String variable type
                                                              constructor accepts String, not int or long
                                                              */
        //  another way to create object:
        //  *important! (however to be careful not to exceed limit for long with BigInteger
        //   and double with BigDecimal) - there is no such problem with
        //  object creation and utilizing String argument as in the example above
        //  BigInteger bigNumber = BigInteger.valueOf(1234567890)
        System.out.println("bigNumber = " + bigNumber);

        // add() substract(), multiply(), divide()
        BigInteger first = new BigInteger("123456789012345678901234567890");
        BigInteger second = new BigInteger("987654321987654321987654321");
        BigInteger sum = first.add(second);
        System.out.println("Sum of BigIntegers first: " + first + " and second: " + second + " = " + sum.toString());

        BigDecimal a = new BigDecimal("9.5");
        BigDecimal b = new BigDecimal("4");
        BigDecimal c = new BigDecimal("0.33");
        System.out.println("Calculation og BigDecimals a, b & c = " + a.divide(b).multiply(c));
    }
}
