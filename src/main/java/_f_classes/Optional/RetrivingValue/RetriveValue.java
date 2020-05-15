package _f_classes.Optional.RetrivingValue;

import java.util.Optional;

public class RetriveValue {
    public static void main(String[] args) {
        String name = "Tomasz";
        Optional.ofNullable(name).get();  // Tomasz

        String name1 = null;
        Optional.ofNullable(name1).get()  //  NullPointerException

        String name2 = "Tomasz";
        Optional.ofNullable(name2).orElse("Tomek"); // Tomasz

        String name3 = null;
        Optional.ofNullable(name3).orElse("Tomek"); // Tomek

    }
}
