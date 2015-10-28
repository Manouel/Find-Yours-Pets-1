package company.darktheme.find_yours_pets.engine.animal;

import company.darktheme.find_yours_pets.engine.Refuge;

/**
 * Created by jimmy on 22/10/15.
 */
public class Dog extends Animal {

    public Dog(String name, String race, int age, String description, Refuge refuge) {
        super(name, race, AnimalType.DOG, age, description, refuge);
    }

}
