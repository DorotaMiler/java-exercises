package _i_exceptions._i2_practice_section;

import java.io.FileNotFoundException;

public class FileDesNotExistException extends Exception{
    public FileNotFoundException(String message){
        super(message);
    }
}
