package _h_data_structures._h_1_tables;

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

        String[] names = {"Dorota", "Ania", "Lukasz"};
        int[][] tab = new int[3][3];

        for (int i = 0; i < tab.length; i++) {
            for (int k = 0; k < tab[i].length; k++) {
                tab[i][k] = i + k;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int k = 0; k < tab[i].length; k++) {
                System.out.println("tab[" + i + "][" + k + "] = " + tab[i][k]);
            }
        }
    }

        public void fillAValue(int a[]) {
            for (var i = 0; i < a.length; i++) {
                a[i] = i;
                System.out.println(a[i]);
            }
        }

//        public void fillCValues() {
//            for (var i = 0; i < c.length; i++) {
//                c[i] = i;
//                System.out.println(c[i]);
//            }
//        }

        public void prinetCValues (String[]c) {
            for (var element : c) {
                System.out.println(element);
            }
        }
    }