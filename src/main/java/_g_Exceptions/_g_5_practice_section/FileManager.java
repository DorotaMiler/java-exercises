package _g_Exceptions._g_5_practice_section;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {

        try {
            writeToFile();
        } catch (IOException | InternetConnectionException e) {
            System.out.println(e.getMessage());
        }

        try {
            display();
        } catch (FileDoesNotExistException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void writeToFile() throws InternetConnectionException, IOException {
        File file = new File("practice.txt");
        FileWriter writer = new FileWriter(file);
        if (file.exists()) {
            try {
                writer.write("This is to be written into the practice.txt file");
            } catch (IOException e) {
                throw new InternetConnectionException("Internet connection issue when " + writer + " initiated." + "\nPlease check your wi-fi connection.");
            }
        }
    }

    private static void display() throws FileDoesNotExistException {
        File file = new File("practice.txt");
        if (file.exists()) {
            Scanner scan = null;
            try {
                scan = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new FileDoesNotExistException("Cannot scan text from file because file does not exist.");
            }
            System.out.println("SUCCESS: File's contents are: " + scan.nextLine());
        } else {
            throw new FileDoesNotExistException("Unfortunately file does not exist");
        }
    }
}