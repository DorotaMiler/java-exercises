package _i_exceptions._i2_practice_section;

import java.io.*;

public class FileManager {
    public static void main(String[] args) {

        try {
            writeToFile();
        } catch (IOException | InternetConnectionException e) {
            System.out.println(e.getMessage());
        }

    }


    private static void writeToFile() throws InternetConnectionException, IOException {
        File file = new File("practice.txt");
        FileWriter writer = new FileWriter(file);
        if (file.exists()) {
            try {
                writer.write("This is to be written into the practice.txt file");
            } catch (IOException e) {
                throw new InternetConnectionException("Internet connection issue when when " + writer + " initiated." + "\nPlease check your wi-fi connection.");
            }
        }
    }
}