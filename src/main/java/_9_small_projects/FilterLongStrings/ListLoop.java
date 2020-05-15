package _9_small_projects.FilterLongStrings;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListLoop {

    public static void main(String[] args) {
        longStringsToUpper();
    }

    public static void longStringsToUpper() {
        List<String> names = Arrays.asList("Iwo", "Sebastian", "Anna", "Katarzyna", "Aleksander", "Monika", "Ida", "Anna");
        Set<String> modifiedNames = new TreeSet<>();

        for (String name : names) {
            if (name.length() > 3) {
                String newName = name.toUpperCase();
                modifiedNames.add(newName);
            }
            System.out.println("All longer thank 3 chars Strings in alphabetic order: ");
            for (String modifiedName : modifiedNames) {
                System.out.println(modifiedName);
            }

            System.out.println("Names starting with A letter: ");
            for (String modifiedName : modifiedNames) {
                if (modifiedName.startsWith("A")) {
                    System.out.println(modifiedName);
                }
            }
        }
    }
}
