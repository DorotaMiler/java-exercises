package _m_classes.m_2_Object_class._m_2_1_equals;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println("Reference comparison -> ");
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) -> "+s1.equals(s2));  // true
    }
}
