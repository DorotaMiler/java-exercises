package _i_exceptions;

public class Main {
    public static void main(String[] args) {
        HourToSeconds hourToSeconds = new HourToSeconds();
        int calculation1 = hourToSeconds.getNumberOfSeconds(3);
        System.out.println("1st calculation result: " + calculation1);
    }
}