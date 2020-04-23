package _f_classes.Optional.NullPointerException;

import java.util.Optional;

public class UserService {
    public Optional<User> fetchUser(String name) {
        if ("Dorota".equals(name)) {
            return Optional.of(new User("Dorota"));
        } else
            // by below means I avoid null
            return Optional.empty();
    }
}