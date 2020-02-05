package _2_data_types._2_1_variables;

public class Variables {
    public static void main(String[] rgs) {
        int age;  //  variable declaration (variable's type choice + it's name)
        age = 19; // afterwards variable initiation
        /* most common to concatenate both in one row:
        int age = 19;
         */
        System.out.println("I am  " + age + " years old.");
        System.out.println(age + " is a beautiful number.");
        System.out.println("Additionally " + age + " is a prime number");
        System.out.println("A number, that follows " + age + " is: " + (age + 1));
    }
}
