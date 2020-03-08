package _e_Exceptions._g_4_my_own_exceptions._g_5_1_LimitExceeded;

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
