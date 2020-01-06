package _8_Scanner;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter("dorota.txt");
        writer.println("Dorota has a cat and a cat has me");
        writer.close();
    }
}