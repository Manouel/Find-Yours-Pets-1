package company.darktheme.find_yours_pets.engine;

import company.darktheme.find_yours_pets.engine.animal.Animal;
import company.darktheme.find_yours_pets.engine.animal.AnimalType;
import company.darktheme.find_yours_pets.engine.user.UserDefault;
import company.darktheme.find_yours_pets.engine.user.UserSPA;

/**
 * Created by jimmy on 22/10/15.
 */
public class SimulationBD {

    public static void main (String[] args){
        System.out.println("Hello Master Falindir");

        create();
    }

    public static void create() {

        UserSPA morgane = new UserSPA("morgane", "vidal", "morgane@gmail.com", "Gouga34");

        Refuge beziers = new Refuge("SPA", "45 rue de l'ada", "0466573994", "un jolie refuge", morgane);

        Animal shana = new Animal("shana", "epagnol", AnimalType.DOG, 8, "une chienne passive", beziers);
        Animal gold = new Animal("gold", "golden retriver", AnimalType.DOG, 4, "un chien bizarre", beziers);

        UserDefault jimmy = new UserDefault("jimmy", "lopez", "jimmy@gmail.com", "Falindir");

        System.out.println(shana.toString());
        System.out.println(gold.toString());

        System.out.println(beziers);
    }
}
