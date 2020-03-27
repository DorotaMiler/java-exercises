package _9_small_projects.EnumApp;


/**
 * This 'enum' application signifies available math operations:
 * add, subtract, multiply and divide and enables a choice of
 * one of the four options. Afterwards via enum it returns
 * chosen option depending on a display menu's 1,2,3 and 4 options.
 * If the given menu option number is not valid
 * (exceeds available options or is a negative number),
 * the console asks to reenter a correct option number.
 * Input of 0 number will stop the application immediately.
 */

public class Main {
    public static void main(String[] args) {

        RunMathOperations run = new RunMathOperations();
        try {
            run.chooseMathOperation();
        } catch (ZeroValueException e) {
            e.printStackTrace();
        }
    }
}