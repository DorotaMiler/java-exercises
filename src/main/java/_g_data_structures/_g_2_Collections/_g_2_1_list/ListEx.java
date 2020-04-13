package _g_data_structures._g_2_Collections._g_2_1_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        // .add adds at the end of a list
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(4567);
        list1.add(-87);
        System.out.println("\n 1st -> list display: ");
        displayListValue(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(35);
        list2.add(-6);

        list1.addAll(list2);
        System.out.println("\n 2nd -> list modification: ");
        displayListValue(list1);

        List<Integer> list3 = new LinkedList<>();
        list3.add(3);
        list3.add(0, 7890);

        list1.addAll(1, list3);  // starting from second position ->
        // list  added to list1
        System.out.println("\n 3rd -> list modification: ");
        displayListValue(list1);


        List<Integer> collection1 = new ArrayList<>();
        List<Integer> collection2 = new LinkedList<>();

        collection1.add(-90);
        collection1.add(2);
        collection1.add(3);

        collection2.add(4);
        collection2.add(0, 10);
        collection1.addAll(2, collection2);
    }

    public static void displayListValue(List list) {
        System.out.println("Display of elements: \n");
        for (var element : list) {
            System.out.println(element);
        }
    }

    public void displayPreciseValue(List list) {
        System.out.println(list.get(0));  //  0 is an index
        System.out.println(list.get(3));
    }

//    add & addAll - addin elements to the end of list
//    clear - clearing allelements
//    remove & removeAll - removing elements
//    isEmpty - check if list is empty
//    size - check size
//    set - exchange of one elemnt to another
//    sort - sorting a list
//    toArray - change to a table
//    indexOf​ - displaying a position f requested element

    public void printOutElements(List collection) {
        System.out.println("Elements are: \n");
        for (var element : collection) {
            System.out.println(element);
        }
    }

}