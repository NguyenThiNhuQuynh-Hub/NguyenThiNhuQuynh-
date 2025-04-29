package AbstractFactory;



import Animal.Cat;
import Animal.Dog;
import Animal.IAnimal;

import java.util.Random;

public class FourLegsAnimalFactory extends AbstractAnimalFactory {
    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2); // Generates either 0 or 1
        if (type == 0) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
