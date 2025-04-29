package Factory;



import Animal.Cat;
import Animal.Dog;
import Animal.Duck;
import Animal.IAnimal;

import java.util.Random;

public class RandomAnimalFactory implements IAnimalFactory {
    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(3); // Generates 0, 1, or 2
        if (type == 0) {
            return new Dog();
        } else if (type == 1) {
            return new Cat();
        } else {
            return new Duck();
        }
    }
}