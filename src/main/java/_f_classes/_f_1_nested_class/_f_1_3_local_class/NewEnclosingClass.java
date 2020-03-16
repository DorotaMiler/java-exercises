package _f_classes._f_1_nested_class._f_1_3_local_class;

public class NewEnclosingClass {

    private static int mainCount = 4;
    private int pubCount = 2;

    void addCounts(){

        // -> You typically find local classes defined in the
        // body of a method.
        class LocalClass{
            void addMembers(){
                System.out.println(mainCount+pubCount);
            }
        }
        LocalClass lc = new LocalClass();
        lc.addMembers();
    }

    //  local classes allow to modify and access the class
    //  constructor - an important distinction to
    //  anonymous classes

}
