package _6_conversions_and_data_types_casting;

public class Conversions {
    public static void main(String[] args) {

        // (niejawna [java does it for us] konwersja rozszerzajaca) - having doble devided by int
        int a = 5;   // before devision is done, a converted to double, therefore c MUST be double as well
        double b = 13.5;
        double c = b / a;  // if c was int, ERROR would occure
        System.out.println("c = " + c);

        // (jawna konwersja zawezajaca) - enforcement of conversion by placing brackets with contents of wanted type
        int x = 5;
        double y = 13.5;
        int z = (int) b / a;  // some data lost, decimal cut out
        System.out.println("z = " + z);  // Math.round() rounds the number, here it is gotten rid of

        /* not necessary action as done automatically
        int a = 5;
        double b = 13.5;
        double c = b / (double) a;
         */


    }
}
