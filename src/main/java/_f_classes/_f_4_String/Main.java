package _f_classes._f_4_String;

import static _f_classes._f_4_String.StringConcat.collectionsJoining;
import static _f_classes._f_4_String.StringConcat.stringsJoining;
import static _f_classes._f_4_String.StringSeparators.colonsInString;

public class Main {
    public static void main(String[] args) {
        colonsInString("many:colons:in:string");
        StringSeparators stringSeparators = new StringSeparators();
        stringSeparators.dotsInString();
        stringsJoining();
        collectionsJoining();
    }
}