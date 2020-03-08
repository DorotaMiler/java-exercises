package _g_classes._j_4_String;

import static _g_classes._j_4_String.StringConcat.collectionsJoining;
import static _g_classes._j_4_String.StringConcat.stringsJoining;
import static _g_classes._j_4_String.StringSeparators.colonsInString;

public class Main {
    public static void main(String[] args) {
        colonsInString("many:colons:in:string");
        StringSeparators stringSeparators = new StringSeparators();
        stringSeparators.dotsInString();
        stringsJoining();
        collectionsJoining();
    }
}