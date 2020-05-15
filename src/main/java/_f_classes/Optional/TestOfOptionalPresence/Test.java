package _f_classes.Optional.TestOfOptionalPresence;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        // empty optional heck:
        Optional<String> empty = Optional.empty();
        empty.isPresent(); // false
        empty.isEmpty(); // true


        // not empty optional check:
        Optional<String> notEmpty = Optional.of("Not empty");
        notEmpty.isEmpty(); // false
        notEmpty.isPresent(); // true

        //  NullPointerException:
        String value = null;
        Optional.of(value);

        // it is safr to utiliza .ofNullable to avoid exception:
        String value1 = null;
        Optional<String>empty = Optional.ofNullable(value);
        empty.isPresent(); // false
        empty.isEmpty(); // true
    }
}
