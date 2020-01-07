package _8_Scanner;

import javax.xml.bind.SchemaOutputResolver;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadOut {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dorota.txt");
        //System.out.println(file.getAbsolutePath());
        Scanner scan = new Scanner(file.getAbsolutePath());

        String sentence = scan.nextLine();
        System.out.println("Read-out sentence is: " + sentence);
    }
}
