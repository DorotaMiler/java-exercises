package _2_data_types_and_casting._2_3_generic_types;

public class Main {

    public static void main(String[] args) {
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();

        System.out.println("First orange generated from FruitBx class: " + fruit1.getClass());
    }
}
