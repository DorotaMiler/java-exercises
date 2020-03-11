package _2_data_types_and_casting._2_3_generic_types._2_3_1_factual_generic_types._2_3_2_casting_happening;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();
        System.out.println("First orange generated from FruitBox class: " + fruit1.getClass());

        BoxOnSteroids<Apple> applebox= new BoxOnSteroids<>(new Apple());
        //  the above same as below:
        //  BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<Apple>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<>(new Orange());
        Orange orange = orangeBox.getFruit();
        System.out.println("Orange from the orange box which is on steroids is: " + orange);

        Pair<BoxOnSteroids<Orange>,BoxOnSteroids<Apple>> pairOfBoxes = new Pair<>(new BoxOnSteroids<>(new Orange()), new BoxOnSteroids<>(new Apple()));
    }
}