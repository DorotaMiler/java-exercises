package _9_loops;

public class ForEach {
    public static void main(String[] args) {

        // filling in table with numbers from1 to 10
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = i + 1;
        }

        // display of the created table
        for (int x : table) {
            System.out.println(x + " element of the table = " + x);
        }
        // second for loop
        String[] names = {"Dorota", "Adam", "Kuba", "Filip", "Dagmara"};
        System.out.println("\n");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Array's " + i + " index name is: " + names[i]);
        }

        // for each loop
        System.out.println("\n");
        for (String name : names) {
            System.out.println(name);
        }


    }

}

