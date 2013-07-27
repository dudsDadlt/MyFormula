package com.app.myformula;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class AndroidCompass extends Activity {

	private static SensorManager mySensorManager;
	private boolean sersorrunning;
	private Compass myCompassView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.compass);

		myCompassView = (Compass) findViewById(R.id.mycompass);

		mySensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		List<Sensor> mySensors = mySensorManager
				.getSensorList(Sensor.TYPE_ORIENTATION);

		if (mySensors.size() > 0) {
			mySensorManager.registerListener(mySensorEventListener,
					mySensors.get(0), SensorManager.SENSOR_DELAY_GAME);
			sersorrunning = true;


		} else {
			Toast.makeText(this, "No ORIENTATION Sensor", Toast.LENGTH_LONG)
					.show();
			sersorrunning = false;
			finish();
		}
	}

	private SensorEventListener mySensorEventListener = new SensorEventListener() {

		@Override
		public void onAccuracyChanged(Sensor sensor, int accuracy) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onSensorChanged(SensorEvent event) {
			// TODO Auto-generated method stub
			myCompassView.updateDirection(event.values[0]);
		}
	};

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

		if (sersorrunning) {
			mySensorManager.unregisterListener(mySensorEventListener);
		}
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