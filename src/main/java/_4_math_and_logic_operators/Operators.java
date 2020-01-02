package _4_math_and_logic_operators;

public class Operators {
    public static void main(String[] args) {
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
        int z = x + y++;  // z = x + y, and afterwards y = y + 1
        System.out.println(y);
        System.out.println(z);
        z = (x++) + y;  // z = x + y, and then afterwards x = x + 1

    }
}
