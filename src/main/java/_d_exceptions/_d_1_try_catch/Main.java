package _d_exceptions._d_1_try_catch;

import java.util.Scanner;

public class Main {

    // example with scanner
    int[] table = {1, 2, 3, 4, 5};
    Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease advise of a chosen index, of which number you want to see: ");
    int index = scan.nextInt();

    //   1a) solution:
    //  if (index >= 0 && index < table.length) {
    //   System.out.println("Due to chosen index, array's number is: " + table[index]);
    //   } else {
    //   System.out.println("The given index is incorrect, please verify (array's length is: " + table.length + " elements.");
    //   }

    //  1b) solution
        try

    {
        System.out.println("Due to chosen index, array's number is: " + table[index]);
    } catch(
    ArrayIndexOutOfBoundsException e)

    {
        System.out.println("The given index is incorrect, please verify (array's length is: " + table.length + " elements.");
    }
}