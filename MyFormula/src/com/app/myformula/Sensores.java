package com.app.myformula;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sensores extends ListActivity implements OnItemClickListener {
    ListView listView;
    static final String[] SPORTS = {"Lista de Sensores", "Acelerometro",
            "Sensor de Proximidade", "Magnetrometro", "Bussola", "Giroscopio", "Gravidade"};

    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listView = getListView();

        // ////DIVIDER PERSONALIZATION//////////////
        int[] colors = {0, 0xFFFF0000, 0}; // red for the example
        listView.setDivider(new GradientDrawable(Orientation.RIGHT_LEFT, colors));
        listView.setDividerHeight(2);

        // MANEIRA 2
        // ColorDrawable devidrColor = new ColorDrawable(
        // this.getResources().getColor(R.color.sage));
        // listView.setDivider(devidrColor);
        // listView.setDividerHeight(2);

        // Own row layout
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.sensores,
                SPORTS));
        listView.setOnItemClickListener(this);
    }

    @Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                            long arg3) {

        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(this, Lista_Sensores.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, Accelerometer.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, Proximidade.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, MagneticField.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this, AndroidCompass.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(this, Gyroscope.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(this, Gravity.class);
                startActivity(intent);
                break;

            default:
                break;
        }

    }

    @Override
	protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();

    }

    // ///////////////////////MENU///////////////////////////

    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater awesome = getMenuInflater();
        awesome.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                startActivity(new Intent("com.app.myformula.TABSMENU"));
                return true;
            case R.id.menu2:
                startActivity(new Intent("com.app.myformula.SOBRE"));
                return true;

            case R.id.preferences:
                startActivity(new Intent("com.app.myformula.BACK"));// tenporario
                return true;

        }
        return false;

    }

}
