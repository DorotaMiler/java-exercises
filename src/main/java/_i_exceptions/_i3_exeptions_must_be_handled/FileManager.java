package _i_exceptions._i3_exeptions_must_be_handled;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    File file = new File("test.txt");

    try{
        Scanner scan = new Scanner(file);
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }
}