package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_1_HomeAnimals;

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
