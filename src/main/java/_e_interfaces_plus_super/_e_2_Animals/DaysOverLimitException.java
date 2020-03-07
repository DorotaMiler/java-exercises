package _e_interfaces_plus_super._e_2_Animals;

/**
 * The DaysOverLimitException wraps all checked standard
 * Java exceptions and enriches them with a custom error code.
 * You can use this code to retrieve localized error messages
 * and to link to our online documentation.
 *
 * @author Dorota Miler
 */

public class DaysOverLimitException extends Exception {

    public DaysOverLimitException(String message, Throwable cause) {
        super(message, cause);
    }
}
