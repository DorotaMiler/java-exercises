package _i_Java9;
import java.util.List;

public class CollectionCopy {

    public static void main(String[] args) {
        //copied list so that it would not be modifiable
        final var strings = List.of("SomeString", "AnotherString");
        final var copyOfLIst = List.copyOf(strings);
        System.out.println(copyOfLIst);
    }
}