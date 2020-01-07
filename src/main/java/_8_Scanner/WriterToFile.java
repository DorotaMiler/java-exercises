package _8_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dorota.txt");
        Scanner scan = new Scanner(file.getAbsolutePath());
        PrintWriter writer = new PrintWriter(file.getAbsolutePath());
        writer.println("Dorota has a cat and a cat has me");
        writer.close();
    }
}