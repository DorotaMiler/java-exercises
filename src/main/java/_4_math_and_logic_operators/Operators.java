package _4_math_and_logic_operators;

public class Operators {
    public static void main(String[] args) {

        //  Mathematical operators
        int a = 17;
        int b = 4;
        int c = a + b;  // 21
        System.out.println(c);
        c = a - b;  // 13
        System.out.println(c);
        c = a * b;  // 68
        System.out.println(c);
        c = a / b;  // 4 cause 4 * 4 = 16 and remaining rest = 1;
        System.out.println(c);
        c = a % b;
        System.out.println(c);
        c = 17 + 6;
        System.out.println(c);
        int result = 2 + 2*2; // 6
        System.out.println(result);

        int d = 18;
        double e = 5.0;
        d += e;  // d = d + e
        System.out.println(a);
        d -= e;  // d = d - e
        d *= e;  // d = d * e
        d /= e;  // d = d / e
        d %= e;  // d = d % e
        System.out.println(d);

        int x = 5;
        int y = 3;
        int z = x + y++;  // z = x + y, and afterwards y = y + 1 so y = 3 still
        System.out.println(y);
        System.out.println(z);
        z = y + x++;  /* z = x + y, and then afterwards x = x + 1
                         y = 4, x = 5 still
                      */
        System.out.println(x);
        System.out.println(z);
        z = y + x;
        System.out.println(z);  // 10 - both y & x are incremented by 1 already

        //  Comparing operators
        boolean comparison = x == y;
        System.out.println(comparison);  // false (x different than (not equal) y)
        System.out.println(x >= y);  // true
        System.out.println(y != 4);  // true

        //  Condition? statement1 : statement2   -> 3 arguments operator

        //  Logical operators
        int first = 5;
        int second = 3;
        boolean result1 = first > second;  // true
        System.out.println("result1 = "+result1);
        boolean result2 = first < second;  // false
        System.out.println("result2 = "+result2);
        boolean result3 = first == second;  //  false
        System.out.println("result3 = "+result3);
        boolean conjunction1 = result1 && result3;  // false -> true&&false=false
        System.out.println("conjunction1 = "+conjunction1);
    }
}