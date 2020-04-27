package _h_data_structures._h_2_Collections._h_2_1_list.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {

        // ex1
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

        // ex2
        Set<String> names = new TreeSet<>();
        names.add("Kate");
        names.add("Dorothy");
        names.add("Ann");
        names.add("Peter");
        names.add("Kate");
        names.add("Thomas");
        names.add("Kate");

        int printSize = names.size();
        System.out.println("Number of unique names in the set: " + printSize);
        System.out.println("Check if Set called 'names' is empty: " + names.isEmpty());
        boolean isThereAnn = names.contains("Ann");
        System.out.println("Is there Ann in the set: " + isThereAnn);
        displayelements(names);
        names.clear();
        System.out.println("Number of names' set elements: " + names.size());
    }

    public static void displayelements(Set set) {
        System.out.println("Set's elements: \n");
        for (var element : set) {
            System.out.println(element);
        }
        System.out.println("\n");
    }

    //  * LinkedHashSet remembers order of adding each element
    //    * boolean add(E e) - adds unique elemnt to set, in case element is
    //    repeated, adding is ignored. Uniquality is checked thanks to
    //    methods: hashCode() & equals().
    //    One null value possible to be added to Set
    //    * boolean contains(Object o) - checks if "o" object is in Set
    //    * boolean isEmpty() - checks if Set is empty
    //    * Iterator iterator() - returns iterator; sequence of
    //    elements dependent on utilized implementation
    //    * boolean remove(Object o) - removes "o" element from Set
    //    * int size() - displays amount of Set's elements
}