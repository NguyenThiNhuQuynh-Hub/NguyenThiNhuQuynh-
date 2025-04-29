package AbstractFactory;



import Animal.Chicken;
import Animal.Duck;
import Animal.IAnimal;

import java.util.Random;

public class TwoLegsAnimalFactory extends AbstractAnimalFactory {
    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2);
        if (type == 0) {
            return new Chicken();
        } else {
            return new Duck();
        }
    }
}
