package _j_classes._j_3_String;

import java.util.StringJoiner;

public class StringConcat {

    public static void stringsJoining() {
        // note: String immutable; join() utilizez StringJoiner which uses
        // StringBuilder therefore processing profitability maintained

        StringJoiner joiner = new StringJoiner(" ", "{", "}");
        String result = joiner.add("Dorota").add("is").add("ill").add("and").add("stays").add("home").toString();
        System.out.println(result);
    }
}