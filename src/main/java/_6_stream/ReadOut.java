package _6_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadOut {
    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("dorota.txt");
        //System.out.println(file.getAbsolutePath());
        Scanner scan = new Scanner(new File("./src/main/java/_8_Scanner/dorota.txt"));

        while (scan.hasNextLine()) {
            String sentence = scan.nextLine();
            System.out.println(sentence);
        }
    }
}