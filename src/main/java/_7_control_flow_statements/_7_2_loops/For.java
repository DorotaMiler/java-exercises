package _7_control_flow_statements._7_2_loops;

/**
 * The for statement provides a compact way to iterate
 * over a range of values. It has two forms, one of which
 * was designed for looping through collections and arrays.
 */

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("This is a for loop, line: " + i);
            //  after the instruction in the end of loop i++
        }
        System.out.println("The end of a for loop");
    }
}
