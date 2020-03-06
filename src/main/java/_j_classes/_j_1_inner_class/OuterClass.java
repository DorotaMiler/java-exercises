package _j_classes._j_1_inner_class;

public class OuterClass {

    public class InnerClass{
    }

    public InnerClass instantiate(){
        return new InnerClass();
    }

    public static void innerClassInstantiation(){
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass instance1 = outerClass.instantiate();
        OuterClass.InnerClass instance2 = outerClass.new InnerClass();
    }

}
