package company.darktheme.find_yours_pets.engine;

import java.util.ArrayList;
import java.util.List;

import company.darktheme.find_yours_pets.engine.animal.Animal;
import company.darktheme.find_yours_pets.engine.user.UserSPA;

/**
 * Created by jimmy on 22/10/15.
 */
public class Refuge {

    private String name;

    private String address;

    private double longitude;

    private double latitude;

    private String tel;

    private String description;

    private List<UserSPA> administrator = new ArrayList<>();

    private List<Animal> animals = new ArrayList<>();

    private List<Picture> pictures = new ArrayList<>();

    public Refuge(String name, String address, String tel, String description, UserSPA firstAdmin) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.description = description;

        if(!administrator.contains(firstAdmin))
            administrator.add(firstAdmin);

        firstAdmin.setRefuge(this);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getTel() {
        return tel;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getDescription() {
        return description;
    }

    public List<UserSPA> getAdministrator() {
        return administrator;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void addAnimal(Animal a) {
        if(a != null) {
            if(!animals.contains(a)) {
                if(a.getRefuge() == this) {
                    animals.add(a);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Refuge{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", tel='" + tel + '\'' +
                ", description='" + description + '\'' +
                ", administrator=" + administrator +
                ", animals=" + animals +
                ", pictures=" + pictures +
                '}';
    }
}
