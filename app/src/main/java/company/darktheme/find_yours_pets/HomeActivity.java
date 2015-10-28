package company.darktheme.find_yours_pets;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import company.darktheme.find_yours_pets.engine.SimulationBD;
import company.darktheme.find_yours_pets.engine.animal.Animal;
import company.darktheme.find_yours_pets.tools.MenuManager;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GridLayout petsGrid = (GridLayout) findViewById(R.id.petsGrid);

        SimulationBD.create();

        for (Animal a : SimulationBD.animals) {
            LinearLayout petLayout = new LinearLayout(this);
            petLayout.setOrientation(LinearLayout.VERTICAL);

            ImageButton petPicture = new ImageButton(this);
            petPicture.setImageResource(R.drawable.dog);

            TextView petName = new TextView(this);
            petName.setText(a.getName());
            petName.setGravity(Gravity.CENTER);

            petLayout.addView(petPicture);
            petLayout.addView(petName);

            petsGrid.addView(petLayout);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuManager.defaultMenu(this, item.getItemId()) || super.onOptionsItemSelected(item);
    }
}
