package _6_Scanner;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class NewFileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("created.txt");
        boolean success = file.createNewFile();
        System.out.println("Was file successfully created: " + success);

        PrintWriter writer = new PrintWriter(file);
        writer.println("Luki ma loki :)");
        writer.println("A Kubi i Fili to nasza miloc");
        writer.close();    //  only after close() elements are written in a file;
        //  before that all stored in buffer
    }
}
