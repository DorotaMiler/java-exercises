package _2_data_types_and_casting._2_3_generic_types._2_3_1_factual_generic_types._2_3_2_casting_happening;

public class Main {

    public static void main(String[] args) {

        //  * Orange, Apple, FruitBox:
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();
        System.out.println("First orange generated from FruitBox class: " + fruit1.getClass());

        //  * BoxOnStreroids, Apple, Orange
        BoxOnSteroids<Apple> applebox = new BoxOnSteroids<>(new Apple());
        //  the above same as below:
        //  BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<Apple>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<>(new Orange());
        Orange orange = orangeBox.getFruit();
        System.out.println("Orange from the orange box which is on steroids is: " + orange);

        Pair<BoxOnSteroids<Orange>, BoxOnSteroids<Apple>> pairOfBoxes = new Pair<>(new BoxOnSteroids<>(new Orange()), new BoxOnSteroids<>(new Apple()));

        //  * Figure, Circle & BoxForFigures:
        BoxForFigures<Circle> circleBox = new BoxForFigures<>(new Circle());
        //  BoxForFigures<Apple>applebox //  compilation error

        //  * Rectangle, Aquare & BoxForFigures:
        Rectangle rectangle = new Square();
        // -> compilation error:
        // BoxForFigures<Rectangle>rectangleBox = new BoxForFigures<Square>(new Square());

        // GenericExample:
        GenericExample <String> genericExample1= new GenericExample<>();
        GenericExample <Integer> genericExample2= new GenericExample<>();
        System.out.println("genericExample1's type is: "+genericExample1.getItem().getClass());
        System.out.println("genericExample2's type is: "+genericExample2.getItem().getClass());
    }
}