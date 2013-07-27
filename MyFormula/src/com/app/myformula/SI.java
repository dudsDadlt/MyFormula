package com.app.myformula;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SI extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.si);
        getActionBar().setDisplayHomeAsUpEnabled(true);

    }

    // //////////////MENU/////////////////////////////////////////

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

        }

        return super.onOptionsItemSelected(item);

    }
}

