package _d_exceptions._d_4_custom_exceptions._d_4_3_over_a_limited_value;

public class LimitException extends Exception {
    int limit;

    public LimitException(int limit) {
        this.limit = limit;
    }

    public String toString() {
        return "CustomException [" + limit + " ]";
    }
}