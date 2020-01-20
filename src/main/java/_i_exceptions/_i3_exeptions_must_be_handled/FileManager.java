package _i_exceptions._i3_exeptions_must_be_handled;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {

        File file = new File("test.txt");

        try {
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            // personalized message
            System.out.println("There is no such file");
            // test.txt (No such file or directory)
            System.out.println(e.getMessage());
            // test.txt (No such file or directory)
            System.out.println(e.getLocalizedMessage());
            // pile
            // of branch control structure (run for review :))
            e.printStackTrace();
        }
    }
}