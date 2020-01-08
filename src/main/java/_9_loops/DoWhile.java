package _9_loops;

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
