package _g_exceptions._g_5_my_own_exceptions._g_5_3_wrong_parameter;

import java.util.Scanner;

public class IntegerNumber {
    
    public void intro() {
        System.out.println("Please enter a single integer: ");
    }

    public int integerRequest() {
        intro();
        int number = scanNumber();
        boolean isInteger = true;

        while (isInteger) {
            try {
                number;
                isInteger = !isInteger
            } catch (Exception e) {
                System.out.println("Inserted number is not an integer. Please try again: ");
            }
        }
        return number;
    }

    private int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int scannedNumber = scan.nextInt();
        return scannedNumber;
    }

}
