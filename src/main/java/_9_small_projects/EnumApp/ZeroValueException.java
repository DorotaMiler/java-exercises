package _9_small_projects.EnumApp;

/**
 * Custom exception class
 */

public class ZeroValueException extends Exception{
    int limit;

    public ZeroValueException(int limit){
        this.limit = limit;
    }
    public ZeroValueException(String message){
        RunMathOperations run = RunMathOperations();
        if(run.chosenOption){
            throw new ZeroValueException("Zero value -> program termination :(");
        }
        super(message);
    }
}