package company.darktheme.find_yours_pets.engine;

import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimmy on 22/10/15.
 */
public abstract class User {

    private String firstName;

    private String lastName;

    private String email;

    private String pseudo;

    private String tel;

    private UserRole role;

    private List<Animal> animalsAdopted = new ArrayList<>();

    private List<Picture> picture = new ArrayList<>();

    private List<Animal> following = new ArrayList<>();

    public User(String firstName, String lastName, String email, String pseudo, UserRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pseudo = pseudo;
        this.role = role;
    }

    public String getFirtName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getTel() {
        return tel;
    }

    public UserRole getRole() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<Animal> getAnimalsAdopted() {
        return animalsAdopted;
    }

    public List<Picture> getPicture() {
        return picture;
    }

    public List<Animal> getFollowing() {
        return following;
    }
}
