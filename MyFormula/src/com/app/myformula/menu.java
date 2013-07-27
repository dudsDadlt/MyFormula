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
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class menu extends ListActivity {
	ListView listView;

	String FormulaList[] = { "Mecanica", "Termologia", "Optica", "Ondulatoria", "Eletromagnetismo" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		listView = getListView();

        ////////PERSONALIZE/////////////////////
		int[] colors = { 0, 0xff00ffff, 0 }; // red for the example
		listView.setDivider(new GradientDrawable(Orientation.RIGHT_LEFT, colors));
		listView.setDividerHeight(2);

		// List
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, FormulaList));
	}

	@Override
	protected void onListItemClick(ListView lv, View v, int position, long id) {
		super.onListItemClick(lv, v, position, id);
		String openClass = FormulaList[position];
		try {
			Class selected = Class.forName("com.app.myformula." + openClass);
			Intent selectedIntent = new Intent(this, selected);
			startActivity(selectedIntent);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} finally {

		}

	}

	@Override
	protected void onPause() {

		// TODO Auto-generated method stub
		super.onPause();

	}

    /////////////////////MENU////////////////////////////////////

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
