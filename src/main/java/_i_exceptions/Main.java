package _i_exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HourToSeconds hourToSeconds = new HourToSeconds();
        int calculation1 = hourToSeconds.getNumberOfSeconds(3);
        System.out.println("1st calculation result: " + calculation1);

        // example with scanner
        int[] table = {1, 2, 3, 4, 5};
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPlease advise of a chosen index, of which number you want to see: ");
        int index = scan.nextInt();

//        1a) solution:
//        if (index >= 0 && index < table.length) {
//            System.out.println("Due to chosen index, array's number is: " + table[index]);
//        } else {
//            System.out.println("The given index is incorrect, please verify (array's length is: " + table.length + " elements.");
//        }

        // 1b? solution
        try {
            System.out.println("Due to chosen index, array's number is: " + table[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The given index is incorrect, please verify (array's length is: " + table.length + " elements.");
        }
    }
}