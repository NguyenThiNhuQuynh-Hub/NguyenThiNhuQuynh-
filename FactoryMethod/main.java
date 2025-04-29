import Factory.BasicAnimalFactory;
import Factory.IAnimalFactory;
import Factory.RandomAnimalFactory;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        IAnimalFactory factory;
        Random random = new Random();
        int type = random.nextInt(2); // 0 hoặc 1

        if (type == 0) {
            factory = new BasicAnimalFactory();
        } else {
            factory = new RandomAnimalFactory();
        }

        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
    }
}
