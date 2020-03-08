package _3_math_and_logic_operators;

public class Operators {
    public static void main(String[] args) {

        //  Mathematical operators (+, -, *, %, /):
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
        int result = 2 + 2 * 2; // 6
        System.out.println(result);

        // shortened operators (x += y):
        int d = 18;
        double e = 5.0;
        d += e;  // d = d + e
        System.out.println(a);
        d -= e;  // d = d - e
        d *= e;  // d = d * e
        d /= e;  // d = d / e
        d %= e;  // d = d % e
        System.out.println(d);

        // increment (++) & decrement (--) opearators:
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
        System.out.println("result1 = " + result1);
        boolean result2 = first < second;  // false
        System.out.println("result2 = " + result2);
        boolean result3 = first == second;  //  false
        System.out.println("result3 = " + result3);
        boolean conjunction1 = result1 && result3;  // false -> true&&false=false
        System.out.println("conjunction1 = " + conjunction1);

        /*  !important: we do not compare Objects nor chains with ==
        == compares references, not the very objects
        in order to compare objects to use method
        equals()
         */
        String me = "Dorota";
        String you = "Lukas";
        boolean comparison1 = me == you;
        boolean comparison2 = me.equals(you);
        System.out.println(comparison1);
        System.out.println(comparison2);

        int v = 1;
        int o = 1;
        int n = 2;
        boolean q = v == o && n > o;  //  true && true => true
        boolean w = v <= o && n <= v;  // true && false => false
        boolean r = v == o || n > o;   // true || true => true
        boolean t = v <= o || n <= v;  // true || false => true

        System.out.println("&& (and) first comparison = " + q);
        System.out.println("&& (and) second comparison = " + w);
        System.out.println("|| (or) first comparison = " + r);
        System.out.println("|| (or) second comparison = " + t);

    }
}