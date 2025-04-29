


import AbstractFactory.FourLegsAnimalFactory;
import AbstractFactory.TwoLegsAnimalFactory;
import Factory.IAnimalFactory;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        IAnimalFactory factory;

        Random random = new Random();
        int type = random.nextInt(2); // 0 or 1

        if (type == 0) {
            factory = new FourLegsAnimalFactory();
        } else {
            factory = new TwoLegsAnimalFactory();
        }

        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
    }
}