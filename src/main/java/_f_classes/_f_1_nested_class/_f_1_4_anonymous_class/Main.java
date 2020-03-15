package _f_classes._f_1_nested_class._f_1_4_anonymous_class;

public class Main {

    // -> utilization of the anonymous class when you need functionality
    // but not necessarily a separate entity.

    // Creating a new class that implements the Math
    // interface would be overkill (especially since
    // using the math variable in only one place).

    public static void main(String[] args) {
        AnonymousExample ae = new AnonymousExample();
        ae.math.add();  //  result = 6
    }
}