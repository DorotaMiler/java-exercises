package _g_data_structures._g_2_Collections._g_2_1_list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(5);
        set2.add(4);
        set2.add(8);
        set2.add(6);
        set2.add(7);

        set1.addAll(set2);
        displayelements(set1);
    }

    public static void displayelements(Set set) {
        System.out.println("Set's elements: \n");
        for (var element : set) {
            System.out.println(element);
        }
    }
}