package _g_exceptions._i3_exceptions_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagerScanAndWriter {
    public static void main(String[] args) {

        try {
            run();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        try {
            display();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void run() throws IOException {
        File file = new File("test.txt");

        FileWriter writer = new FileWriter(file);
        writer.write("This is just a test");
        writer.close();
    }

    private static void display() throws IOException {
        File file = new File("test.txt");
        if (file.exists()) {
            Scanner scan = new Scanner(file);
            System.out.println(scan.nextLine());
        } else {
            System.out.println("Sorry." + "\nThe file does not exist.");
        }
    }
}
