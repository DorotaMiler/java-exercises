package _i_Java9;

public class SwitchExpressions {

    public static void main(String[] args) {
        // switch expression souting "wartosc"
        final var s = "string";

        switch (s) {
            case "string" -> System.out.println("wartosc");
            case "anotherString" -> System.out.println("wartosc2");
            default -> System.out.println("wartosc3");
        }
    }
}