package _i_Java9;

import java.util.List;
import java.util.stream.Collectors;

public class NewStreamCollectors {

    public static void main(String[] args) {
        //Zadanie 9: Utwórz listę gdzie wartości są równe 5 lub większe lecz lista musi być niemodyfikowalna
        final var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final var modifiedList = list.stream()
                .filter(n -> n >= 5)
                .collect(Collectors.toUnmodifiableList());
        
        modifiedList.forEach(System.out::println);
//        final var unmodifiedList=List.copyOf(list);

    }
}
