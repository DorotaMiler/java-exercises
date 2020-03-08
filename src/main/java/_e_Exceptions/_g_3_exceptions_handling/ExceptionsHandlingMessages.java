package _e_Exceptions._g_3_exceptions_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsHandlingMessages {
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