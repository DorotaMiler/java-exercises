package _g_data_structures._g_2_Collections._g_2_1_list.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> employees = new TreeMap<>();
        boolean isMapEmpty = employees.isEmpty();
        employees.put(11, "Dorota Miler");
        employees.put(22, "Reggie Tyler");
        employees.put(66, "Dennis Pommn");
        employees.put(55, "Goerge Fillis");
        employees.put(44, "Dorota Miler");
        employees.put(33, "Thomas Key");

        System.out.println("Size of a map -> employees: " + employees.size());
        System.out.println("22nd eployee on the list is: " + employees.get(22));
        System.out.println("Is the employees map empty: " + isMapEmpty);
        System.out.println("Does map contain value 'Dennis Pommn' " + employees.containsValue("Dennis Pommn"));
        System.out.println("Is there in a map key: 44: " + employees.containsKey(44));
        Set<Integer> keySet = employees.keySet();
        System.out.println("Keys: " + keySet);


    }
}
