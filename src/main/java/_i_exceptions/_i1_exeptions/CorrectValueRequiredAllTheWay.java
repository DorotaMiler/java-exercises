package _i_exceptions._i1_exeptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrectValueRequiredAllTheWay {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 5};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = -2;
        boolean x = false;

        while (!x) {
            try {
                index = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException n) {
                System.out.println("Not correct format of data :(" + "\nReenter table's index you want to invoke: )";
            } catch (IOException e) {
                System.out.println("Error! - data read-out issue");
            }
            x = index == -2 ? false : true;
        }

        try {
            System.out.println(table[index - 1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Given index not accurate (out of bound). Table's length is: " + table.lenght);
        }
    }
}