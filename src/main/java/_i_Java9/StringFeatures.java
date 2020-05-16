package _i_Java9;

public class StringFeatures {

    public static void main(String[] args) {

        final var myString = " v a l u e ";
        System.out.println(myString.stripTrailing());  // no blank spaces @ the end
        System.out.println(myString.stripLeading());  // no blank spaces @ the beginning

        if (myString.isEmpty() || myString.isBlank()) {
            System.out.println(myString);  // if myString is empty, then sout
        } else{
            System.out.println("myString is NOT empty");
        }
    }
}