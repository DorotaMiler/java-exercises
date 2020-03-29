package _9_small_projects.EnumApp;

/**
 * Custom exception class
 */

public class ZeroValueException extends Exception{
    public ZeroValueException(String message){
        RunMathOperations run = RunMathOperations();
        if(run.chosenOption){
            throw new ZeroValueException("Zero value -> program termination :(");
        }
        super(message);
    }
}