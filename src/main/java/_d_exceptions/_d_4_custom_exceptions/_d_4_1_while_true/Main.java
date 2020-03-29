package _d_exceptions._d_4_custom_exceptions._d_4_1_while_true;

import static _d_exceptions._d_4_custom_exceptions._d_4_1_while_true.HourToSeconds.convertHourToSeconds;

public class Main {
    public static void main(String[] args) {
        try {
            convertHourToSeconds();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}