package _6_Scanner;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // system allows readout from the indicated source - here System.in therefore from console
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Welcome " + name);
    }
}
