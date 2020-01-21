package _i_exceptions._i4_my_own_exceptions.cooopy;

public class FileDoesNotExistException extends Exception{
    FileDoesNotExistException(String message){
        super(message);
    }
}