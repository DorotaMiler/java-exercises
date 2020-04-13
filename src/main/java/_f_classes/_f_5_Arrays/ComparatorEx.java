package _f_classes._f_5_Arrays;

import java.util.Comparator;

public class ComparatorEx implements Comparator<Worker> {

    @Override
    public int compare(Worker worker1, Worker worker2) {
        if (worker2 == null)
            return -1;
        if (worker1.getPayout() > worker2.getPayout())
            return 1;
        else if (worker1.getPayout() < worker2.getPayout())
            return -1;
        else
            return 0;
    }


}