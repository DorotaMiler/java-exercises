package _f_classes._f_1_nested_class._f_5_static_block;

import java.util.LinkedList;
import java.util.List;

public class StaticBlockExample {

    //  initializing a list object with pre-defined values
    //  (If static variables require additional, multi-statement
    //  logic while initialization, then a static block can be used)

    public static List<String> ranks = new LinkedList<>();

    static{
        ranks.add("Lieutenant");
        ranks.add("Captain");
        ranks.add("Major");
    }

    static{
        ranks.add("Colonel");
        ranks.add("General");
    }

    //  it wouldn't be possible to initialize List object
    //  with all the initial values along with declaration;
    //  that's why utilized the static block here


    //  why to use static block:
    //  -> If initialization of static variables requires some
    //  additional logic except the assignment
    //  -> If the initialization of static variables is
    //  error-prone and requires exception handling

}
