package _8_Scanner;

import java.util.Scanner;

public class NumberAndString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int number = scan.nextInt();
        scan.nextLine();  // necessary when we load String afte a number
        System.out.println("Please write a word: ");
        String word = scan.nextLine();

        System.out.println(word + ", " + number);
    }
}