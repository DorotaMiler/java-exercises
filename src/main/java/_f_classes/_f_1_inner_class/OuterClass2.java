package _f_classes._f_1_inner_class;

public class OuterClass2 {

    public static class InnerClass2 {
    }

    public InnerClass2 instantiate() {
        return new InnerClass2();
    }

    public static void staticInnerClassInstantiation(){
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass2 = outerClass2.instantiate();
        OuterClass2.InnerClass2 = new OuterClass2().InnerClass2();
    }

}