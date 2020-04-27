package _g_interfaces._g_1_Comparator._g_1_1_human;

import java.util.ArrayList;
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

        for (Human human : people) {
            System.out.println(human);
        }
    }
}