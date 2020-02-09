package _m_classes._m_1_Scanner_class;

import java.util.Scanner;

public class ScannerClass {

    double firstNumber;
    double secondNumber;

    public void scannerSum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNumber = scan.nextDouble();
        System.out.println("Enter first number: ");
        secondNumber = scan.nextDouble();
        double sum = firstNumber + secondNumber;
        System.out.println("Sum of entered numbers = " + sum);
    }
}