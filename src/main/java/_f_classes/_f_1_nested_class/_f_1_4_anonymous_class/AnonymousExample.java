package _f_classes._f_1_nested_class._f_1_4_anonymous_class;

public class AnonymousExample {

    //  anonymous class does not have a name assigned to it

    //  The same rules for inner classes apply to anonymous
    //  classes with the following exceptions:
    //  -> can't have access modifiers in its declaration
    //  -> can't define constructors or extend/implement other classes or interfaces

    interface Math {
        public void add();
    }

    Math math = new Math() {
        public void add() {
            System.out.println(mainCount + pubCount);
        }
    };

    private static int mainCount = 4;
    private int pubCount = 2;
}