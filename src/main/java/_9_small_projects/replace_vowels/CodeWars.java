package _9_small_projects.replace_vowels;

public class CodeWars {

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL !"));
    }

    public static String disemvowel(String str) {
        String newStr = str.replace("a", "");
        String newStr1 = newStr.replace("e", "");
        String newStr2 = newStr1.replace("i", "");
        String newStr3 = newStr2.replace("o", "");
        String newStr4 = newStr3.replace("u", "");
        String newStr5 = newStr4.replace("A", "");
        String newStr6 = newStr5.replace("E", "");
        String newStr7 = newStr6.replace("I", "");
        String newStr8 = newStr7.replace("O", "");
        String newStr9 = newStr8.replace("U", "");
        return newStr9;
    }
}