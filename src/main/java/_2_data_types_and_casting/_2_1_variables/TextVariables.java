package _2_data_types_and_casting._2_1_variables;

public class TextVariables {
    public static void main(String[] args) {
        String hello = "Hello ";
        String world = "world";
        String greetings = hello + world;  //  concatenation of 2 texts
        System.out.println(greetings);

        String helloStudent = greetings.substring(0, 6) + "student";
        System.out.println(helloStudent);
    }
}
