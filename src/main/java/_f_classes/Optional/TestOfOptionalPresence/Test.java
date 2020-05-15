package _f_classes.Optional.TestOfOptionalPresence;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        empty.isPresent(); // false
        empty.isEmpty(); // true
    }
}
