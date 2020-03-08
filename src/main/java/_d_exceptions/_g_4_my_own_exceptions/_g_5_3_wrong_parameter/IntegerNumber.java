package _d_exceptions._g_4_my_own_exceptions._g_5_3_wrong_parameter;

import java.util.Scanner;

public class IntegerNumber {

    public void intro() {
        System.out.println("Please enter a single integer: ");
    }

    public int integerRequest() {
        intro();
        int number = 0;
        boolean isInteger = true;

        while (isInteger) {
            Scanner scan = new Scanner(System.in);
            try {
                number = scan.nextInt();
                isInteger = !isInteger;
            } catch (Exception e) {
                System.out.println("Inserted number is not an integer. Please try again: ");
            }
        }
        return number;
    }
}
