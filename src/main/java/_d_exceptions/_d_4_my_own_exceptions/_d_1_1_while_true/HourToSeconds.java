package _d_exceptions._d_4_my_own_exceptions._d_1_1_while_true;

import java.util.Scanner;

public class HourToSeconds {

    public int getNumberOfSeconds(int hour) throws IllegalArgumentException {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be integer >= 0: (you wrote) " + hour + " -> please revise");
        } else {
            return hour * 60 * 60;
        }
    }

    public void scanHour() throws IllegalArgumentException{
        int hours = -4;
        int numberOfSeconds = 0;
        boolean isNumberCorrect = true;
        HourToSeconds hourToSeconds = new HourToSeconds();
        System.out.println("Please advise of an amount of hours you would like to convert into correspondent amount of seconds: ");

        while(isNumberCorrect){
            Scanner scan = new Scanner(System.in);
            try{
                numberOfSeconds = hourToSeconds.getNumberOfSeconds(scan.nextInt());
            }catch(IllegalArgumentException e){
                numberOfSeconds = hourToSeconds.getNumberOfSeconds((scan.nextInt())*-1);
            }
            isNumberCorrect = hours instanceof Integer ?false:true;
        }
       try{
           System.out.println();
       }
        HourToSeconds hourToSeconds = new HourToSeconds();
        Scanner scan = new Scanner(System.in);
        int result = hourToSeconds.getNumberOfSeconds(scan.nextInt());
        System.out.println("1st calculation result: " + result);

        int hours = -4;
        int numberOfSeconds = 0;
        HourToSeconds instance = new HourToSeconds();
        try {
            numberOfSeconds = instance.getNumberOfSeconds(hours);
        } catch (IllegalArgumentException e) {
            numberOfSeconds = instance.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);
    }

}