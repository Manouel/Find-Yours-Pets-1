package company.darktheme.find_yours_pets.engine;

/**
 * Created by jimmy on 22/10/15.
 */
public class UserDefault extends User {

    public UserDefault(String firstName, String lastName, String email, String pseudo) {
        super(firstName, lastName, email, pseudo, UserRole.DEFAULT);
    }
}
