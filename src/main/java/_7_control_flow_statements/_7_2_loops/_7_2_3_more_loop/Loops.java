package _7_control_flow_statements._7_2_loops._7_2_3_more_loop;

public class Loops {

    int starter = 10;
    int param;

    public void whileNegative(int negative) {
        while (negative < 0) {
            System.out.println("Number = " + negative);
            negative++;
        }
    }

    public void doWhilePositive(int positive) {
        do {
            positive--;
            System.out.println("depreciated number = " + positive);
        } while (positive > 0);
    }

    public void iterator() {
        for (int i = 0; i < starter; i++) {
            System.out.println("Iterator = " + i);
        }
    }

    public void continueEx() {
        int x = -7;
        while (x < 0) {
            if (x == -4) {
                continue;
            }
            if (x == -2) {
                System.out.println("break");
                break;
            }
            x++;
            System.out.println("After iteration number = " + x);
        }
    }

    public static void oddNumber(int param) {
//        System.out.println("These are the odd numbers not greater than given parameter: " + param);
        for (int i = 0; i <= param; i++) {
            if (i % 2 == 0) {
                continue;
            } else if (param % 11 == 0) {
                break;
            } else {
                System.out.println("Odd number: " + i);
            }
        }
    }
}


















































































































































































































































































































































































































































































































































































































































































































































