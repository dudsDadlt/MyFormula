package com.app.myformula;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

public class Lista_Sensores extends Activity {

	SensorManager sm;
	List<Sensor> ss;
	TextView sslist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lista_sensores);

		sslist = (TextView) findViewById(R.id.sensorList);
		sm = (SensorManager) getSystemService(SENSOR_SERVICE);
		ss = sm.getSensorList(Sensor.TYPE_ALL);

		for (Sensor s : ss) {
			sslist.append("\n\n" + s.getName());
		}

	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

	}

	// /////////////////MENU////////////////////////
	@Override
	public boolean onCreateOptionsMenu(Menu menu1) {
		super.onCreateOptionsMenu(menu1);
		MenuInflater awesome = getMenuInflater();
		awesome.inflate(R.menu.main_menu, menu1);
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
		case android.R.id.home:
			// app icon in action bar clicked; go home
			Intent intent = new Intent(this, TabsMenu.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			return true;
		}

		return super.onOptionsItemSelected(item);

	}
}
