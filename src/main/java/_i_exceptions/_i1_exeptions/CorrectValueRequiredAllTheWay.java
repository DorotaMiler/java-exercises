package _i_exceptions._i1_exeptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CorrectValueRequiredAllTheWay {
    public static void main(String[] args) {
        int[]table = {1,2,3,4,5};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(reader.readLine());
    }
}
