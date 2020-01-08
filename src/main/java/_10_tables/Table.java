package _10_tables;

public class Table {
    public static void main(String[] args) {
        int[] table = new int[20];
        for (int i = 0; i < 20; i++) {
            table[i] = i + 1;
        }
        int variable = table[3];
        System.out.println("Chosen variable = " + variable);

        for (int j = 0; j < 20; j++) {
            System.out.println((j + 1) + " table's elemnt is: " + table[j]);
        }
    }
}
