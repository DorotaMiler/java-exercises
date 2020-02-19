package _h_types_comparison._h_1_objects_comparison_with_hashcode;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HashTest {

    public static void main(String[] args) throws IOException {
        Product product1 = new Product("Czekolada", 3.99);
        Product product2 = new Product("Czekolada", 3.99);
        System.out.println("Equals() result: " + product1.equals(product2));
        // below default hashcode() method for calculation utilizez object's address in memory
        // this value is utilized in toString() in hexadecimal version
        System.out.println("Product1 hashcode: " + product1.hashCode());
        System.out.println("Product2 hasgcode: " + product2.hashCode());

        // object of Path created
        Path path = Paths.get("home/dorotamiler/Desktop/Dorota Miler_CV.pdf");

        int hashCode = path.hashCode();
        System.out.println("path object's Hash Code: " + hashCode);
    }
}