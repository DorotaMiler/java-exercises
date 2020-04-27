package _g_interfaces._g_1_Comparator._g_1_1_human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Human> people = new ArrayList<Human>();
        people.add(new Human.HumanBuilder("Dorota", "Miler")
                .sex('F')
                .build());
        people.add(new Human.HumanBuilder("Kasia", "Beka")
                .sex('F')
                .build());
        people.add(new Human.HumanBuilder("Tomek", "Juka")
                .sex('M')
                .build());
        people.add(new Human.HumanBuilder("Michal", "Szutek")
                .sex('M')
                .build());
        people.add(new Human.HumanBuilder("Jakub", "Trele")
                .sex('M')
                .build());
        people.add(new Human.HumanBuilder("Jakub", "Wrona")
                .sex('M')
                .build());
        people.add(new Human.HumanBuilder("Anna", "Juka")
                .sex('M')
                .build());

        for (Human human : people) {
            System.out.println(human);
        }

        Collections.sort(people);

        System.out.println("People sorted by last names and secondary by names: ");
        for(Human human:people){
            System.out.println(human);
        }
    }
}