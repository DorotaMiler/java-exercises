package _b_inheritance._b_2_interface_and_abstract_methods._b_2_1_examples._b_2_1_2_ZOOApp;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant();
        elephant1.setName("Dumbo");
        elephant1.eat(1000);
        elephant1.growOld(30);

        Elephant elephant2 = new Elephant("Pumbo");
        elephant2.eat(2000);
        elephant2.growOld(77);

        Lion lion3 = new Lion();
        lion3.setName("Mufasa");
        lion3.eat(300);
        lion3.growOld(25);

        Parrot parrot1 = new Parrot();
        parrot1.eatPlant(3);
        parrot1.growOld(2);

        Eagle eagle1 = new Eagle();
        eagle1.eatMeat(2);
        eagle1.eatPlant(1);
        Eagle eagle2 = new Eagle();
        eagle2.eatPlant(1);
        eagle2.eatMeat(3);

        Animal elephant3 = new Elephant();
        elephant3.setName("Trumbo");
        elephant3.eat(3000);
        elephant3.growOld(91);

        List<Elephant> elephants = new ArrayList<>();
        elephants.add(elephant1);
        elephants.add(elephant2);

        List<Animal> animals = new ArrayList<>();
        animals.add(elephant3);

        List<Lion> lions = new ArrayList<>();
        lions.add(new Lion("Simba"));
        lions.add(new Lion("Nala"));
        lions.add(lion3);

        List<Herbivore> herbivores = new ArrayList<>();
        herbivores.add(parrot1);
        herbivores.add(elephant1);
        herbivores.add(elephant2);
        herbivores.add(eagle1);
        herbivores.add(eagle2);

        List<Carnivore> carnivores = new ArrayList<>();
        carnivores.add(eagle1);
        carnivores.add(eagle2);
        carnivores.add(lion3);

        System.out.println("Elephants' amount: " + elephants.size());
        System.out.println("Lions'' amount: " + lions.size());
        System.out.println("Herbivores'' amount: " + herbivores.size());
        System.out.println("Animals' amount: " + animals.size());
        System.out.println("Carnivores' amount: " + carnivores.size());
    }
}