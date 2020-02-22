package _j_classes._j_3_String;

import java.util.Scanner;

public class StringSeparators {

    String string;

    public static void colonsInString(String string) {
        String[] stringArray = string.split(":");
        System.out.println("Strings array's length: " + stringArray.length);
        String newString = "";
        for (int i = 0; i < stringArray.length; i++) {
            newString = newString.concat(stringArray[i] + " ");
        }
        System.out.println(newString.trim());
    }


//    public Integer dotsInString(String string) {
//        scannerSentence(string);
//        Integer counter = 0;
//        String[] stringArray = string.split(".");
//        for (int i = 0; i < stringArray.length; i++) {
//            counter = counter + string.indexOf(".");
//        }
//        return counter;
//    }
//
//    public String scannerSentence(String inputLine) {
//        System.out.println("Please enter a random sentence: ");
//        Scanner scan = new Scanner(System.in);
//        inputLine = scan.nextLine();
//        return inputLine;
//    }
}
