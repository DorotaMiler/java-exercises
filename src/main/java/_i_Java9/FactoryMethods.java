package _i_Java9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

    public static void main(String[] args) {
        //Set creation utilizing static method of()
        Set<String> personSet = new HashSet<>();
        personSet.add("Person1");
        personSet.add("Person2");
        Set<String> personSet1 = Set.of("Person1", "Person2");
        System.out.println(personSet1);

        //HashMape<Integer,String> creation utilizing static method ofEntries()
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Osoba1");
        mapa.put(2, "Osoba2");
        Map<Integer, String> map1 = Map.ofEntries(Map.entry(1, "Osoba1"), Map.entry(2, "Osoba2"));
        System.out.println(map1);
    }
}
