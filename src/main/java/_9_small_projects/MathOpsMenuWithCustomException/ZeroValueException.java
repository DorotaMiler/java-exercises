package _9_small_projects.MathOpsMenuWithCustomException;

/**
 * Custom ZeroValueException wraps a checked standard Java
 * exception and enriches it with a custom error
 * code indicating filed of not accepted value
 * (in this particular cse: 0).
 * You can use this code to retrieve localized error messages.
 *
 * @author DMiler
 */

public class ZeroValueException extends Exception {
    int notAcceptedValue;

    public ZeroValueException(int notAcceptedValue) {
        this.notAcceptedValue = notAcceptedValue;
    }


    public String toString(){
        return "CustomZeroValueException [" + notAcceptedValue + " ]";
    }
}