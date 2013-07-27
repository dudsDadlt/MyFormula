package com.app.myformula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Termologia extends Activity {

    EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12,
            et13, et14, et15, et16, et17, et18, et19, et20, et21, et22, et23,
            et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34,
            et35, et36;
    TextView tvr1, tvr2, tvr3, tvr4, tvr5, tvr6, tvr7, tvr8, tvr9, tvr10,
            tvr11, tvr12, tvr13, tvr14, tvr15, tvr16, tvr17;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.termologia);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	protected void onPause() {

		// TODO Auto-generated method stub
		super.onPause();

	}

    public void OnButtonClickedAddAndDisplay(View v) {

        et1 = (EditText) findViewById(R.id.ett1);
        et2 = (EditText) findViewById(R.id.ett2);

        tvr1 = (TextView) findViewById(R.id.tvrt1);

        String s1, s2;

        s1 = et1.getText().toString();
        s2 = et2.getText().toString();

        Float n1, n2, r1;

        n1 = Float.parseFloat(s1);
        n2 = Float.parseFloat(s2);

        r1 = n1 / n2;

        tvr1.setText(" V = " + r1 + "m/s");

    }

    ///////////////////MENU////////////////////////

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
