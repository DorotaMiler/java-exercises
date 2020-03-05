package _g_Exceptions._g_1_try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WhileTillCorrectValue {
    public static void main(String[] args) {
//        correctTableIndex();

        try {
            getIntegerValue();
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }

//        getIntegerValue1();
    }

    public static void correctTableIndex() throws NumberFormatException, IOException {
        int[] table = {1, 2, 3, 4, 5, 6};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = -2;
        boolean x = false;
        System.out.println("Please enter the index of which array's number you want to display: ");

        while (!x) {
            try {
                index = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException n) {
                System.out.println("Not correct format of data :(" + "\nReenter correct array's index you want to invoke: ");
            } catch (IOException e) {
                System.out.println("Error! - data read-out issue");
            }
            x = index == -2 ? false : true;
        }

        try {
            System.out.println("SUCCESS:" + "\n Array's number correspondent with given index is:" + table[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Given index not accurate (out of bound). Table's length is: " + table.length);
        }
    }

    public static void getIntegerValue() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer integer = null;
        boolean isInteger = true;
        System.out.println("Please advise of an integer number: ");

        while (isInteger) {
            try {
                integer = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Input format of data incorrect. Please try again(integer necessary)");
            } catch (IOException e) {
                System.out.println("Error - input/output issue");
            }
            isInteger = integer instanceof Integer ? false : true;
        }
        System.out.println("Correct! -> value confirmation: " + integer);
    }

    private static void getIntegerValue1() throws Exception {
        Scanner scanner;
        Integer integer = null;
        boolean isInteger = true;

        while (isInteger) {
            scanner = new Scanner(System.in);
            System.out.println("Please advise of an integer number: ");
            try {
                integer = scanner.nextInt();
                isInteger = !isInteger;
            } catch (Exception e) {
                System.out.println("This is not an integer - please insert correct integer number:");
            }
        }
        System.out.println("Correct input integer value: " + integer);
    }
}