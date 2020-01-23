package _i_exceptions._i2_practice_section;

import com.sun.tools.jdeprscan.scan.Scan;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {

    writeToFile();
}


private static void writeToFile(){
    File file = new File ("practice.txt");
    FileWriter writer = new FileWriter(file);
    if(file.exists()) {
        try {
            writer.write("This is to be written into the practice.txt file");
        } catch (IOException e){
        throw new FileDesNotExistException("File not found to use Scanner.");
    }
        System.out.println("scan.");

        }
    }

}