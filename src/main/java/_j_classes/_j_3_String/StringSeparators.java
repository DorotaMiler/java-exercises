package _j_classes._j_3_String;

public class StringSeparators {

    public static void stringsSeparator() {
        String string = "string:separated:by:colons";
        String[] stringArray = string.split(":");
        System.out.println("Strings array's length: " + stringArray.length);
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
