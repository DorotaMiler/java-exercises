package _7_control_flow_statements._7_2_loops;

/**
 * The for statement provides a compact way to iterate
 * over a range of values. It has two forms, one of which
 * was designed for looping through collections and arrays.
 *
 * Programmers often refer to it as the "for loop" because
 *
 * of the way in which it repeatedly loops until a particular condition is satisfied.
 *
 * ->  When using this version of the for statement, keep in mind that:
 *  - The initialization expression initializes the loop; it's executed once, as the loop begins.
 *  - When the termination expression evaluates to false, the loop terminates.
 *  - The increment expression is invoked after each iteration through the loop; it is perfectly
 *  acceptable for this expression to increment or decrement a value.
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
