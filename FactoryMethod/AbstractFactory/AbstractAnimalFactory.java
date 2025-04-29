package AbstractFactory;


import Animal.IAnimal;
import Factory.IAnimalFactory;

public abstract class AbstractAnimalFactory implements IAnimalFactory {
    public abstract IAnimal createAnimal();
}
