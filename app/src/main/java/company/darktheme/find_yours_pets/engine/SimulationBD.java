package company.darktheme.find_yours_pets.engine;

import java.util.ArrayList;
import java.util.List;

import company.darktheme.find_yours_pets.engine.animal.Animal;
import company.darktheme.find_yours_pets.engine.animal.AnimalType;
import company.darktheme.find_yours_pets.engine.user.UserDefault;
import company.darktheme.find_yours_pets.engine.user.UserSPA;

/**
 * Created by jimmy on 22/10/15.
 */
public class SimulationBD {

    public static List<Refuge> refuges = new ArrayList<Refuge>();

    public static List<Animal> animals = new ArrayList<Animal>();

    public static UserSPA morgane;

    public static void main (String[] args){
        System.out.println("Hello Master Falindir");

        create();
    }

    public static void create() {

        morgane = new UserSPA("morgane", "vidal", "morgane@gmail.com", "Gouga34");

        refuges.add(new Refuge("SPA", "45 rue de l'ada", "0466573994", "un jolie refuge", morgane));

        animals.add(new Animal("shana", "epagnol", AnimalType.DOG, 8, "une chienne passive", refuges.get(0)));
        animals.add(new Animal("gold", "golden retriver", AnimalType.DOG, 4, "un chien bizarre", refuges.get(0)));
        animals.add(new Animal("pepita", "fox coton", AnimalType.DOG, 4, "un chien trouillard", refuges.get(0)));

        UserDefault jimmy = new UserDefault("jimmy", "lopez", "jimmy@gmail.com", "Falindir");
    }
}
