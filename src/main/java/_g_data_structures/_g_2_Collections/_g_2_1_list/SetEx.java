package _g_data_structures._g_2_Collections._g_2_1_list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {

        //  unique elements + sorted elements guaranteed -> TreeSet
        Set<Integer> set1 = new TreeSet<>();

        //  unique elements -> HashSet
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(2);
        System.out.println("Set1 at first: ");
        displayelements(set1);

        set2.add(5);
        set2.add(4);
        set2.add(8);
        set2.add(6);
        set2.add(7);
        System.out.println("Set2: ");
        displayelements((set2));

        set1.addAll(set2);
        System.out.println("Set1 after .addAll(): ");
        displayelements(set1);
    }

    public static void displayelements(Set set) {
        System.out.println("Set's elements: \n");
        for (var element : set) {
            System.out.println(element);
        }
        System.out.println("\n");
    }

    //  * LinkedHashSet remembers order of adding each element
}