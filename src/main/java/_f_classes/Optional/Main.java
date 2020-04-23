package _f_classes.Optional;

import java.util.Optional;

//When getting an Optional return type, we're likely to check
// if the value is missing, leading to fewer NullPointerExceptions in
// the applications.
// * An Optional type can be a return type for most methods

public class Main {
    public static void main(String[] args) {
        OptionalEx optionalEx = new OptionalEx();
        Integer value1 = null;
        Integer value2 = new Integer(12);

        // Optional.ofNullable - allows passed param to be null
        Optional<Integer> firstParam = Optional.ofNullable(value1);

        // Optional.of - thwors NullPointerException if passed parameter is null
        Optional<Integer> secondParam = Optional.of(value2);
        System.out.println(optionalEx.sum(firstParam, secondParam));

        // Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + firstParam.isPresent());
        System.out.println("Second parameter is present: " + secondParam.isPresent());

        // Optional.orElse - return the value if present otherwise the default passed value
        Integer value1 = firstParam.orElse((new Integer(2)));

        // Optional.get - gets the value, value should be present
        Integer valuue2 = secondParam.get();
        return value1 + value2;
    }
}