package _b_inheritance._b_5_super_and_this._b_5_2_animals;

//  cool insight:
// https://howtodoinjava.com/java/basics/this-vs-super/
// https://www.geeksforgeeks.org/difference-super-java/

public class Main {
    public static void main(String[] args) {
        // below Animal as reference; Dog as an abject implication
        Animal dog = new Dog("Reksio");
        // or invoking could happen by using just-> new Dog();
        dog.printName();
        dog.move();
    }
}