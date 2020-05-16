package _i_Java9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Vars {

    public static void main(String[] args) {

        var personSet = new HashSet<>();
        personSet.add("Person1");
        personSet.add("Person2");

        final var map = new HashMap<>();
        map.put(1, "Osoba1");
        map.put(2, "Osoba2");

        List<String> list = new ArrayList<>();
        list.add("wartosc1");
        list.add("wartosc2");
        list.add("wartosc3");

        for (var wartosc : list) {
            if ("wartosc".equalsIgnoreCase(wartosc)) {
                break;
            }
        }
    }
}
