package _d_exceptions._g_4_my_own_exceptions._d_1_1_while_true;

public class HourToSeconds {
    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        } else {
            return hour * 60 * 60;
        }
    }
}
