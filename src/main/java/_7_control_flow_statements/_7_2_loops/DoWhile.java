package _7_control_flow_statements._7_2_loops;

/**
 * The while and do-while statements continually execute a block of
 * statements while a particular condition is true. The difference between do-while and while is
 * that do-while evaluates its expression at the bottom of the loop instead of the top.
 * Therefore, the statements within the do block are always executed at least once.
 */

public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println("This is a do...while loop.");
            counter++;
        }
        while (counter < 10);
        System.out.println("The end of the do...while loop.");
    }
}
