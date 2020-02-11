package _m_classes._m_2_Object._m_2_1_equals;

public class Test {

    String a = "string1";
    String b = "string2";

    public void referenceComarison() {
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a !== b");
        }
    }

    public void equalsComparison() {
        if (a.equals(b)) {
            System.out.println("a equals() b");
        } else {
            System.out.println("a doesn't equal() b");
        }
    }
}
