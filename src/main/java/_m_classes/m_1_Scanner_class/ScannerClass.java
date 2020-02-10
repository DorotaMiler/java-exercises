package _m_classes.Scanner_class;

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

    public void objectFeatures() {
        String make;
        int maxSpeed;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car's make: ");
        make = scan.nextLine();
        System.out.println("Thanks!" + "\nnow enter " + make + "'s max speed: ");
        maxSpeed = scan.nextInt();
        CarScan carScan = new CarScan(make, maxSpeed);
        System.out.println("\nSummary -> given car's features: " + "\n" + carScan.getMake() + ", " + carScan.getMaxSpeed());
    }
}