package _7_if_and_switch;

import java.util.Scanner;

public class IfFunction {
    public static void main(String[] args) {

        // first example
        int variable = 5;
        if (variable % 2 == 0) {  // spr czy wynik dzielenia modulo tej liczby przez 2 daje 0
            System.out.println("variable is even");
        } else {
            System.out.println("variable is not even");
        }

        // second example
        if (variable > 10) {
            System.out.println("variable is greater than 10");
        } else if (variable > 0 && variable <= 10) {
            System.out.println("variable is smaller than 10 but greater than 0");
        } else {
            System.out.println("variable is a negative number");
        }

        // example of body temperatures message
        System.out.println("\n.. now using your keyboard please indicate your body temperature: ");
        Scanner scan = new Scanner(System.in);
        double temperature = scan.nextDouble();

        if (temperature < 36.6) {
            System.out.println("You are adynamic -> due to temperature below 36 Celsius.");
        } else if (temperature < 37) {
            System.out.println("You have slightly raised temperature -> due to temperature between 36.6 - 37.0 Celsius.)");
        } else if (temperature < 38) {
            System.out.println("You have a fever -> due to temperature between 37.0 - 38.0 Celsius");
        } else {
            System.out.println("You have at least 38 Celsius fever if not more! -> take a medicine and see a doctor!");
        }
    }
}