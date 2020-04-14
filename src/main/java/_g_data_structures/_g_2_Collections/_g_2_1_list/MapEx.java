package _g_data_structures._g_2_Collections._g_2_1_list;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> employees = new TreeMap<>();
        employees.put(11, "Dorota Miler");
        employees.put(22, "Reggie Tyler");
        employees.put(66, "Dennis Pommn");
        employees.put(55, "Goerge Fillis");
        employees.put(44, "Dorota Miler");
        employees.put(33, "Thomas Key");

        System.out.println("Size of a map -> employees: " + employees.size());

        Set<Integer> keySet = employees.keySet();
        System.out.println("Keys: " + keySet);
    }
}
