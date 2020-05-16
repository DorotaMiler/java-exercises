package _i_Java9;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

        final var maybeOptional = Optional.of("someString");
        maybeOptional.orElseThrow(); // throws NoSuchElementException

        if (maybeOptional.isEmpty()) {
            System.out.println("maybeOptional is empty");
        } else if (maybeOptional.isPresent()) {
            System.out.println("maybeOptional is present");
        }
    }
}