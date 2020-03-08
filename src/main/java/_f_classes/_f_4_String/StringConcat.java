package _f_classes._f_4_String;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcat {

    public static void stringsJoining() {
        // note: String immutable; join() utilizez StringJoiner which uses
        // StringBuilder therefore processing profitability maintained

        StringJoiner joiner = new StringJoiner(" ", "{", "}");
        String result = joiner.add("Dorota").add("is").add("ill").add("and").add("stays").add("home").toString();
        System.out.println(result);
    }

    public static void collectionsJoining() {
        // streams & Collections
        List<String> names = Arrays.asList("Kuba", "Paul", "Philip", "Daria");
        String joinedCollection = names.stream().collect(Collectors.joining(", ", "{", "}"));
        System.out.println(joinedCollection);
    }
}