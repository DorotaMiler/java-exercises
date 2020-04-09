package _g_data_structures._g_1_tables;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        long b[] = new long[10];
        String[] c = new String[5];

        a[0] = 5;
        a[1] = 245;
        a[2] = -27;

        c[0] = "Ala";
        c[2] = "ma";
        c[4] = "kota";

        public void fillAValues() {
            for (var i = 0; i < 100; i++) {
                a[i] = i;
                System.out.println(a[i]);
            }
        }

        public void fillCValues() {
            for (var i = 0; i < 5; i++) {
                c[i] = i;
                System.out.println(c[i]);
            }
        }
    }
}
