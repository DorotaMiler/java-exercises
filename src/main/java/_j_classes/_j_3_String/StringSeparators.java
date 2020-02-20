package _j_classes._j_3_String;

import java.util.Scanner;

public class StringSeparators {

    public static void colonsInString() {
        String string = "string:separated:by:colons";
        String[] stringArray = string.split(":");
        System.out.println("Strings array's length: " + stringArray.length);
        String newString = "";
        for (int i = 0; i < stringArray.length; i++) {
            newString = newString.concat(stringArray[i] + " ");
        }
        System.out.println(newString.trim());
    }


    public static void dotsInString(String string) {
        String scanned = string.scannerIntro();
        int counter = 0;
        String[] stringArray = string.split(".");
        for (int i = 0; i < stringArray.length; i++) {
            counter = counter + string.indexOf(".");
            System.out.println("Amount of dots in given sentence: " + counter);
        }
    }

    public String scannerIntro(String inputLine) {
        System.out.println("Please enter a random sentence: ");
        Scanner scan = new Scanner(System.in);
        inputLine = scan.nextLine();
        return inputLine;
    }
}
