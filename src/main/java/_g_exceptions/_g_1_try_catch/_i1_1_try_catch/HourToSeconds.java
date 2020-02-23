package _g_exceptions._g_1_try_catch._i1_1_try_catch;

public class HourToSeconds {
    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        } else {
            return hour * 60 * 60;
        }
    }
}
