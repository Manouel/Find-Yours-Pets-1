package company.darktheme.find_yours_pets.engine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimmy on 22/10/15.
 */
public class Animal {

    private String name;

    private String race;

    private AnimalType type;

    private int age;

    private String description;

    private Refuge refuge;

    private List<Picture> pictures = new ArrayList<>();

    private User adopter;

    private List<User> follower = new ArrayList<>();

    public Animal(String name, String race, AnimalType type, int age, String description, Refuge refuge) {
        this.name = name;
        this.race = race;
        this.type = type;
        this.age = age;
        this.description = description;
        this.refuge = refuge;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public AnimalType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }

    public Refuge getRefuge() {
        return refuge;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public User getAdopter() {
        return adopter;
    }

    public List<User> getFollower() {
        return follower;
    }

    public boolean haveAdopter() {
        return adopter != null;
    }


}
