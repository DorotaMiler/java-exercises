package _c_inheritance._c_4_overriding._c_4_1_animal;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant();
        elephant1.setName("Dumbo");
        elephant1.weight = 7000;
        elephant1.eat(1000);
        elephant1.growOld(30);
        elephant1.growOld(2);

        Elephant elephant2 = new Elephant();
        elephant2.setName("Pumbo");
        elephant2.weight = 9000;
        elephant2.eat(2000);
        elephant2.growOld(77);

        Animal elephant3 = new Elephant();
        elephant3.setName("Trumbo");
        elephant3.weight = 8000;
        elephant3.eat(3000);
        elephant3.growOld(91);

        List<Elephant> elephants = new ArrayList<>();
        elephants.add(elephant1);
        elephants.add(elephant2);

        List<Animal> animals = new ArrayList<>();
        animals.add(elephant3);

        System.out.println("Elephants' amount: "+elephants.size());
        System.out.println("Animals' amount: "+animals.size());


    }
}
