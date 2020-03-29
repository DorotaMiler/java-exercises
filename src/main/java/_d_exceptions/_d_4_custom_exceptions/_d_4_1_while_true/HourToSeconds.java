package _d_exceptions._d_4_custom_exceptions._d_4_1_while_true;

import java.util.Scanner;

import static java.lang.Math.abs;

public class HourToSeconds {

    public Integer getNumberOfSeconds(Integer hour) {
        return hour * 60 * 60;
    }


    public static void convertHourToSeconds() throws IllegalArgumentException {
        System.out.println("Please advise of an amount of hours as an integer number, which you would like to convert into correspondent amount of seconds: ");
        Integer numberOfSeconds = null;
        Integer hours = null;
        boolean isNumberCorrect = true;
        HourToSeconds hourToSeconds = new HourToSeconds();

        while (isNumberCorrect) {
            Scanner scan = new Scanner(System.in);
            hours = scan.nextInt();
            try {
                numberOfSeconds = hourToSeconds.getNumberOfSeconds(hours);
            } catch (IllegalArgumentException e) {
                numberOfSeconds = hourToSeconds.getNumberOfSeconds(hours * -1);
            }
//            isNumberCorrect = hours < 0 ? true : false;
        }
        System.out.println("The result of converting " + abs(hours) + " hour(s) to seconds = " + numberOfSeconds);
    }
}