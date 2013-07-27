package com.app.myformula;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class TabsMenu extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabs);

		// /////////////////////TABS///////////////////////////////
		Resources res = getResources();
		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

		Intent intent1 = new Intent(this, menu.class);
		TabSpec tabSpec1 = tabHost.newTabSpec("tab1");
		tabSpec1.setIndicator("Formulas");
		tabSpec1.setContent(intent1);
		tabHost.addTab(tabSpec1);

		Intent intent2 = new Intent(this, Sensores.class);
		TabSpec tabSpec2 = tabHost.newTabSpec("tab2");
		tabSpec2.setIndicator("Sensores");
		tabSpec2.setContent(intent2);
		tabHost.addTab(tabSpec2);

        Intent intent3 = new Intent(this, Outros.class);
        TabSpec tabSpec3 = tabHost.newTabSpec("tab3");
        tabSpec3.setIndicator("Outros");
        tabSpec3.setContent(intent3);
        tabHost.addTab(tabSpec3);
	}

	// ////////////////////MENU/////////////////////////////
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
			Intent intent = new Intent(this, TabsMenu.class);
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