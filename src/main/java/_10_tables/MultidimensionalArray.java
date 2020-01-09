package _10_tables;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        table[2][1] = 5;
        int variable = table[2][1];
        System.out.println("Chosen variable from the table [][] is: " + variable);
    }
}
