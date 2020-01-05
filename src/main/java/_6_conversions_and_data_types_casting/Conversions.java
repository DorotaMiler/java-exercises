package _6_conversions_and_data_types_casting;

/*
(niejawna konwersja rozszerzajaca) - having doble devided by int

 */

public class Conversions {
    public static void main(String[] args) {
        int a = 5;   // before devision is done, a converted to double, therefore c MUST be double as well
        double b = 13.5;
        double c = b /a;  // if c was int, ERROR would occure
        System.out.println("c = "+ c);
    }
}
