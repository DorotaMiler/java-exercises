package _g_Exceptions._g_4_my_own_exceptions._g_5_2_File_Existance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManagerWriterCopy {
    public static void main(String[] args) {

        
//        try {
//            run();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            display();
        } catch (FileDoesNotExistException e) {
            System.out.println(e.getMessage());
        }
    }

//    private static void run() throws IOException {
//        File file = new File("test.txt");
//
//        FileWriter writer = new FileWriter(file);
//        writer.write("This is just a test");
//        writer.close();
//    }

    private static void display() throws FileDoesNotExistException {
        File file = new File("test.txt");
        if (file.exists()) {
            Scanner scan = null;
            try {
                scan = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new FileDoesNotExistException("File does not exist");
            }
            System.out.println(scan.nextLine());
        } else {
            throw new FileDoesNotExistException("File does not exist");
        }
    }
}