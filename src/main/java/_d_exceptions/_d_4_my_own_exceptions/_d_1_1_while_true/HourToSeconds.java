package _d_exceptions._d_4_my_own_exceptions._d_1_1_while_true;

import java.util.Scanner;

public class HourToSeconds {

    public Integer getNumberOfSeconds(Integer hour) throws IllegalArgumentException {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be integer >= 0: (you wrote) " + hour + " -> please revise");
        } else {
            return hour * 60 * 60;
        }
    }

    public static void convertHourToSeconds() throws IllegalArgumentException {
        System.out.println("Please advise of an amount of hours as an integer number, which you would like to convert into correspondent amount of seconds: ");
        Integer numberOfSeconds = 0;
        Scanner scan = new Scanner(System.in);
        Integer hours = scan.nextInt();
        boolean isNumberCorrect = true;
        HourToSeconds hourToSeconds = new HourToSeconds();

        while (isNumberCorrect) {
            try {
                numberOfSeconds = hourToSeconds.getNumberOfSeconds(hours);
            } catch (IllegalArgumentException e) {
                numberOfSeconds = hourToSeconds.getNumberOfSeconds(hours * -1);
            }
            isNumberCorrect = hours < 0 ? true : false;
        }
        System.out.println("The result of converting " + hours + " hour(s) to seconds = " + numberOfSeconds);
    }
}