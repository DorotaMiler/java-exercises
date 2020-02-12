package _m_classes._m_3_String;

public class StringImmutable {
    public static void main(String[] args) {

        // char vs String
        char[] chars = {'k', 'i', 'd', 'd', 'o', '-', 'a', 'p', 'p'};
        String b = new String(chars);
        String a = "kiddo-app";
        System.out.println("chars: " + b + "\nString a: " + a);

        // concat(): 1st -> kiddo
        String c = "kiddo";
        c.concat("app");
        System.out.println(c);

        //contact(): 2nd -> kiddo-app
        c = c.concat("-app");
        System.out.println(c);

        // substring()
        System.out.println("Chars from 2nd till 4th -> " + c.substring(2, 4));

        // '+' utilization like StringBuilder with append() with argument lastly casting .toString()
        // so below 1st approach:
        String s = "Kasia";
        s = s + " i Tomek";
        System.out.println("+ operators's utilization: " + s);

        // 2nd approach:
        String w = "Kasia ";
        w = new StringBuffer(w).append("i Tomek").toString();
        System.out.println("StringBuffer utilized literally: " + w);

        String s1 = "DOROTAMiler";
        String s2 = new String("dorotaMiler");
        System.out.println("s1 equals s2?: " + s1.equals(s2));
        System.out.println("s1 equalsIgnoreCase s2?: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 == s2?: " + (s1 == s2));
        System.out.println("s1 compareToIgnoreCase?: " + s1.compareToIgnoreCase(s2)); // 0 -> they are equal (compares the Unicode value)
        System.out.println("s1 compare s2?: " + s1.compareTo(s2));  // -32 -> compareTo() is case sensitive

    }
}