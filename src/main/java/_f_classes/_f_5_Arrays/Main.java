package _f_classes._f_5_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Worker mariusz = new Worker("Mariusz", "Tela", 12000);
        Worker kasia = new Worker("Kasia", "Qubek", 3000);
        Worker daria = new Worker("Daria", "Jure", 7800);
        Worker przemek = new Worker("Przemek", "Ketla", 13500);

        Worker[] workers = {mariusz, kasia, daria, przemek};
        ComparatorEx comparatorEx = new ComparatorEx();
        Arrays.sort(workers, comparatorEx);
        display(workers);

    }

    public static void display(Worker[] workers) {
        for (Worker worker : workers)
            System.out.println(worker);
    }
}
