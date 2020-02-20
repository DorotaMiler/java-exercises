package _j_classes._j_3_String;

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
}

//    dotsInString() {
//
//    }

//    public String scannerIntro(String inputLine) {
//        Scanner scan = new Scanner(System.in);
//        inputLine = scan.nextLine();
//    }
