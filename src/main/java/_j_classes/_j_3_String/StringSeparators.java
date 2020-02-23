package _j_classes._j_3_String;

import java.util.Scanner;

public class StringSeparators {

    public static void colonsInString(String string) {
        String[] stringArray = string.split(":");
        System.out.println("Strings array's length: " + stringArray.length);
        long start = System.nanoTime();
        String newString = "";
        StringBuilder sb = new StringBuilder(newString);
        for (int i = 0; i < stringArray.length; i++) {
            sb.append(stringArray[i] + " ");
            // sb.append(stringArray[i]).append(" "); -> almost doubles processing time
            // StringBuffer on other hand - synchronized therefore more time consuming (Time over 180000)
        }
        newString = sb.toString();
        System.out.println(newString.trim() + "; Time1: " + (System.nanoTime() - start));
    }

    public int dotsInString() {
        intro();
        String string = scannedString();
        int counter = string.length() - string.replace(".", "").length();
        System.out.println("Amount of dots in given sentence: " + counter);
        return counter;
    }

    public static void intro() {
        System.out.println("Please enter a random sentence: ");
    }

    public String scannedString() {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        return inputLine;
    }
}