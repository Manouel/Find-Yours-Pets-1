package company.darktheme.find_yours_pets;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import company.darktheme.find_yours_pets.engine.SimulationBD;
import company.darktheme.find_yours_pets.engine.animal.Animal;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GridLayout petsGrid = (GridLayout) findViewById(R.id.petsGrid);

        SimulationBD.create();

        Toast toast = Toast.makeText(getApplicationContext(), Integer.toString(SimulationBD.animals.size()), Toast.LENGTH_SHORT);
        toast.show();
        for (Animal a : SimulationBD.animals) {
            LinearLayout petLayout = new LinearLayout(this);
            petLayout.setOrientation(LinearLayout.VERTICAL);

            ImageButton petPicture = new ImageButton(this);
            petPicture.setImageResource(R.drawable.dog);

            TextView petName = new TextView(this);
            petName.setText(a.getName());

            petLayout.addView(petPicture);
            petLayout.addView(petName);

            petsGrid.addView(petLayout);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
