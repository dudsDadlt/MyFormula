package com.app.myformula;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Proximidade extends Activity implements SensorEventListener{

    TextView proxText;
    SensorManager sm;
    Sensor proxSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proximidade);

        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        proxSensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        proxText = (TextView)findViewById(R.id.proximityTextView);

        sm.registerListener(this, proxSensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        proxText.setText(String.valueOf(event.values[0]));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
    @Override
    protected void onPause() {
        super.onPause();
        sm.unregisterListener(this);
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
