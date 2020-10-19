package dao;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {
    private static List<Animal> animals = new ArrayList<>();
    static {
        Animal a1 = new Animal();
        a1.setName("Dog");
        a1.setAge(5);
        a1.setLinkImg("/WEB-INF/image/dog.png");
        animals.add(a1);

        Animal a2 = new Animal();
        a2.setName("Cat");
        a2.setAge(2);
        a2.setLinkImg("/WEB-INF/image/dog.png");
        animals.add(a2);

        Animal a3 = new Animal();
        a3.setName("Chicken");
        a3.setAge(1);
        a3.setLinkImg("dog.png");
        animals.add(a3);
    }

    public static List<Animal> animalList() {
        return animals;
    }
}
