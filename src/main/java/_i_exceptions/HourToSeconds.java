package _i_exceptions;

public class HourToSeconds {
    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= ;0: " + hour);
        } else {
            return hour * 60 * 60;
        }
    }
}
