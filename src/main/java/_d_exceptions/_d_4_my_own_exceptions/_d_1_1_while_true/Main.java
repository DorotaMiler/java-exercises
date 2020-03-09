package _d_exceptions._d_4_my_own_exceptions._d_1_1_while_true;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HourToSeconds hourToSeconds = new HourToSeconds();
        Scanner scan = new Scanner(System.in);
        int calculation1 = hourToSeconds.getNumberOfSeconds(scan.nextInt());
        System.out.println("1st calculation result: " + calculation1);

        int hours = -4;
        int numberOfSeconds = 0;
        HourToSeconds instance = new HourToSeconds();
        try {
            numberOfSeconds = instance.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException e) {
            numberOfSeconds = instance.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
    }
}