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

        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        if(temperature<36){
            System.out.println();
        }


    }
}
