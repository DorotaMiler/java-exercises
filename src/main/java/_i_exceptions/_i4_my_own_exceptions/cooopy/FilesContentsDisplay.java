package _i_exceptions._i4_my_own_exceptions.cooopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FilesContentsDisplay {
    public static void main(String[] args) {
        try {
            display();
        } catch (FileDoesNotExistException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void display() throws FileDoesNotExistException {
        File file = new File("test.txt");

        if (file.exists()) {
            Scanner scan = null;
            try {
                scan = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new FileDoesNotExistException("File not there.");
            }
            System.out.println(scan.nextLine());
        } else {
            throw new FileDoesNotExistException("File not found.");
        }
    }
}
