package company.darktheme.find_yours_pets.tools;

import android.app.Activity;

import company.darktheme.find_yours_pets.R;

/**
 * Created by jimmy on 28/10/15.
 */
public class MenuManager {

    public static boolean emptyMenu(Activity a, int id) {
        switch (id) {
            case R.id.action_settings :
                return true;
            default:
                return false;
        }
    }

    public static boolean defaultMenu(Activity a, int id) {
        switch (id) {
            case R.id.action_settings :
                return true;
            case R.id.action_profile :
                a.startActivity(ActivityClass.getUserProfile(a));
                return true;
            default:
                return false;
        }
    }
}
