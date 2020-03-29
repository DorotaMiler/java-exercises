package _d_exceptions._d_4_custom_exceptions._d_4_2_LimitExceeded;

import java.io.IOException;

public class LimitExceededException extends IOException {
    private final String limitName;
    private final Long limitValue;

    public LimitExceededException(String message, String limitName, Long limitValue){
        super(message);
        this.limitName=limitName;
        this.limitValue=limitValue;
    }
}
