package _f_classes.Optional.NullPointerException;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {

        Optional<User> user1 = Optional.of(new User("Anna"));
        Optional<User> user2 = Optional.empty();
        Optional<User> user3 = Optional.ofNullable(null);
        //  Optional<User> user4 = Optional.of(null); // java.lang.NullPointerException
        System.out.println("user1.isPresent => " + user1.isPresent()); // true
        System.out.println("user2.isPresent => " + user2.isPresent()); // false
        System.out.println("user3.isPresent => " + user3.isPresent()); // false

        System.out.println(user1.get().getName());  // T
//		System.out.println(user2.get().getName());
        // java.util.NoSuchElementException: No value present

        if (user1.isPresent()) {
            System.out.println(user1.get().getName());
        }

        user2.orElse(new User("New user")).getName();
        user1.orElseThrow(() -> new IllegalStateException("User not found."));

    }
}