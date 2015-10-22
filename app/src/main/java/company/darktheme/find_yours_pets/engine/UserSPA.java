package company.darktheme.find_yours_pets.engine;

/**
 * Created by jimmy on 22/10/15.
 */
public class UserSPA extends User {

    private Refuge refuge;

    public UserSPA(String firstName, String lastName, String email, String pseudo) {
        super(firstName, lastName, email, pseudo, UserRole.SPA);
    }

    public Refuge getRefuge() {
        return refuge;
    }


}
