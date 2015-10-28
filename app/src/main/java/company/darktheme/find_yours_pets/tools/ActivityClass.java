package company.darktheme.find_yours_pets.tools;

import android.app.Activity;
import android.content.Intent;

import company.darktheme.find_yours_pets.AnimalProfileActivity;
import company.darktheme.find_yours_pets.HomeActivity;
import company.darktheme.find_yours_pets.MainActivity;
import company.darktheme.find_yours_pets.RegistrationActivity;
import company.darktheme.find_yours_pets.UserProfileActivity;

/**
 * Created by jimmy on 28/10/15.
 */
public class ActivityClass {

    public static Intent getClass(Activity a, Class cl) {
        return new Intent(a.getApplicationContext(), cl);
    }

    public static Intent getHome(Activity a) {
        return getClass(a, HomeActivity.class);
    }

    public static Intent getUserProfile(Activity a) {
        return getClass(a, UserProfileActivity.class);
    }

    public static Intent getRegistration(Activity a) {
        return getClass(a, RegistrationActivity.class);
    }

    public static Intent getMain(Activity a) {
        return getClass(a, MainActivity.class);
    }

    public static Intent getAnimalProfile(Activity a) {
        return getClass(a, AnimalProfileActivity.class);
    }


}
