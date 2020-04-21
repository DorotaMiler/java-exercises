package _1_HelloWorld;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("Dorota", "Miler")
                .pesel(81122385603)
                .age(39)
                .address("Ul.Gutowa 18/34")
                .phone("+45 6789 345 234")
                .build();

        System.out.println(person1);
    }
}
