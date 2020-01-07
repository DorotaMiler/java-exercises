package _8_Scanner;

import java.io.File;
import java.io.IOException;

public class NewFileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("created.txt");
        boolean success = file.createNewFile();
        System.out.println("Was file successfully created: "+success);

    }
}
