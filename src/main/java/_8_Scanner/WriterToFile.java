package _8_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterToFile {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("./src/main/java/_8_Scanner/dorota.txt");
        writer.println("Dorota has a cat and a cat has me");
        writer.println("second check of writing to file for veryfication");
        writer.close();
    }
}