package _j_classes._j_3_String;

import java.util.Scanner;

public class StringSeparators {

    public static void colonsInString() {
        String string = "string:separated:by:colons";
        String[] stringArray = string.split(":");
        System.out.println("Strings array's length: " + stringArray.length);
        for (int i = 0; i < stringArray.length; i++) {
            String newString = stringArray[i] + " ";
            if (i == stringArray.charAt(stringArray.length - 1)) {
                System.out.println(newString.trim());
            }
        }
    }

//    dotsInString() {
//
//    }

    public String scannerIntro(String inputLine) {
        Scanner scan = new Scanner(System.in);
        inputLine = scan.nextLine();
    }

}