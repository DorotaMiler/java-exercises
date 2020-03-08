package _c_types_comparison._f_2_equals;

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

    public static void productsComparison(Product product1, Product product2) {
        if (product1.equals(product2)) {
            if (product1.hashCode() == product2.hashCode()) {
                System.out.println("Objects: " + product1.getName() + " and " + product2.getName() + " are equal!");
            } else {
                System.out.println("Objects: " + product1.getName() + " and " + product2.getName() + " are not equal :(");
            }
        } else {
            System.out.println("Objects: " + product1.getName() + " and " + product2.getName() + " are not equal :(");
        }
    }
}