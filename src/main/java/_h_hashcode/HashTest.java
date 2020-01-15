package _h_hashcode;

public class HashTest {

    public static void main(String[] args) {
        Product product1 = new Product("Czekolada",3.99);
        Product product2 = new Product("Czekolada",3.99);
        System.out.println("Equals() result: "+product1.equals(product2));
        // below default hashcode() method for calculation utilizez object's address in memory
        // this value is utilized in toString() in hexadecimal version
        System.out.println("Product1 hashcode: "+product1.hashCode());
        System.out.println("Product2 hasgcode: "+product2.hashCode());
    }
}
