package _9_small_projects.replace_vowels;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(noVowPhrase());
    }

    public static String noVowPhrase() {
        System.out.println("Please enter a phrase for vowels to be removed: ");
        Scanner scan = new Scanner(System.in);
        String originalPhrase = scan.nextLine();
        System.out.println("Phrase entered: " + originalPhrase);
        String newPhrase = originalPhrase.replace("a", "");
        String newPhrase1 = newPhrase.replace("e", "");
        String newPhrase2 = newPhrase1.replace("i", "");
        String newPhrase3 = newPhrase2.replace("o", "");
        String newPhrase4 = newPhrase3.replace("u", "");
        String newPhrase5 = newPhrase4.replace("A", "");
        String newPhrase6 = newPhrase5.replace("E", "");
        String newPhrase7 = newPhrase6.replace("I", "");
        String newPhrase8 = newPhrase7.replace("O", "");
        String newPhrase9 = newPhrase8.replace("U", "");
        scan.close();
        return newPhrase9;
    }
}