package com.app.myformula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Sobre extends Activity {

	@Override
	protected void onCreate(Bundle SavedInstances) {
		super.onCreate(SavedInstances);
		setContentView(R.layout.about);

	}

	// ///////////////////////////MENU//////////////////////////////

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
		case android.R.id.home:
			// app icon in action bar clicked; go home
			Intent intent = new Intent(this, menu.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			return true;
		}

		return super.onOptionsItemSelected(item);

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

	}

}
