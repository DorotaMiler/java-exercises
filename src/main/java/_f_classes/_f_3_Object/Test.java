package _f_classes._f_3_Object;

import java.util.Objects;

public class Test {

    public boolean compareObjects(Object o1, Object o2) {
        // if (o1 != null) {
        // return o1.equals(o2);
        // } else {
        //   return false;
        // }

        // now we utilize equals() from Objects class
        return Objects.equals(o1, o2);
    }
}
