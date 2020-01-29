package _7_control_flow_statements._7_2_loops;

/*
The while statement continually executes a block of statements while a
particular condition is true. Its syntax can be expressed as:
 */

public class While {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 10) {
            System.out.println("This is a loop");
            counter++;
        }
        System.out.println("The end of loop");
    }
}
