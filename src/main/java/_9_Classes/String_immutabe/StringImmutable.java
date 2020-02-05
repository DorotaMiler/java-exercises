package _9_Classes.String_immutabe;

public class StringImmutable {
    public static void main(String[] args) {

        // char vs String
        char[] chars = {'k', 'i', 'd', 'd', 'o', '-', 'a', 'p', 'p'};
        String b = new String(chars);
        String a = "kiddo-app";
        System.out.println("chars: " + b + "\nString a: " + a);

        // concat(): 1st -> kiddo
        String c = "kiddo";
        c.concat("app");
        System.out.println(c);

        //contact(): 2nd -> kiddo-app
        c = c.concat("-app");
        System.out.println(c);

        // substring()
        System.out.println("Chars from 2nd till 4th -> "+c.substring(2, 4));

    }
}