package _9_loops;

// loop do ... while
public class Loop {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println("This is a loop");
            counter++;
        }
        while (counter < 10);
        System.out.println("The end of loop");
    }
}
