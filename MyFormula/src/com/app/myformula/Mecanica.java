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

import static android.util.FloatMath.sqrt;

public class Mecanica extends Activity {

	EditText et1, et2, et3, et4, et5, et6, et7, et8, et9, et10, et11, et12,
			et13, et14, et15, et16, et17, et18, et19, et20, et21, et22, et23,
			et24, et25, et26, et27, et28, et29, et30, et31, et32, et33, et34,
			et35, et36;
	TextView tvr1, tvr2, tvr3, tvr4, tvr5, tvr6, tvr7, tvr8, tvr9, tvr10,
			tvr11, tvr12, tvr13, tvr14, tvr15, tvr16, tvr17;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mecanica);
		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	// ////////////VELOCIDADE///////////////

	public void OnButtonClickedAddAndDisplay(View v) {

		et1 = (EditText) findViewById(R.id.et1);
		et2 = (EditText) findViewById(R.id.et2);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr1 = (TextView) findViewById(R.id.tvr1);

		String s1, s2;

		s1 = et1.getText().toString();
		s2 = et2.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 / n2;

		tvr1.setText(" V = " + r1 + "m/s");
	}

	// ////////////////FUNCAO HORARIA DO DESLOCAMENTO/////////////////////

	public void OnButtonClickedAddAndDisplay2(View v) {

		et3 = (EditText) findViewById(R.id.et3);
		et4 = (EditText) findViewById(R.id.et4);
		et5 = (EditText) findViewById(R.id.et5);

		tvr2 = (TextView) findViewById(R.id.tvr2);

		String s1, s2, s3;

		s1 = et3.getText().toString();
		s2 = et4.getText().toString();
		s3 = et5.getText().toString();

		Float n1, n2, n3, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		n3 = Float.parseFloat(s3);

		r1 = n1 + (n2 * n3);

		tvr2.setText(" S = " + r1 + "m");

	}

	// ///////////////////ACELERACAO//////////////////////////////

	public void OnButtonClickedAddAndDisplay3(View v) {

		et6 = (EditText) findViewById(R.id.et6);
		et7 = (EditText) findViewById(R.id.et7);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr3 = (TextView) findViewById(R.id.tvr3);

		String s1, s2;

		s1 = et6.getText().toString();
		s2 = et7.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 / n2;

		tvr3.setText(" a = " + r1 + "m/s^2");

	}

	// ///////////////////FUNCAO HORARIA DA
	// VELOCIDADE//////////////////////////////

	public void OnButtonClickedAddAndDisplay4(View v) {

		et8 = (EditText) findViewById(R.id.et8);
		et9 = (EditText) findViewById(R.id.et9);
		et10 = (EditText) findViewById(R.id.et10);

		tvr4 = (TextView) findViewById(R.id.tvr4);

		String s1, s2, s3;

		s1 = et8.getText().toString();
		s2 = et9.getText().toString();
		s3 = et10.getText().toString();

		Float n1, n2, n3, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		n3 = Float.parseFloat(s3);

		r1 = n1 + (n2 * n3);

		tvr4.setText(" V = " + r1 + "m/s");

	}

	// ///////////TORRICELLI/////////////////////////////

	public void OnButtonClickedAddAndDisplay5(View v) {

		et11 = (EditText) findViewById(R.id.et11);
		et12 = (EditText) findViewById(R.id.et12);
		et13 = (EditText) findViewById(R.id.et13);

		tvr5 = (TextView) findViewById(R.id.tvr5);

		String s1, s2, s3;

		s1 = et11.getText().toString();
		s2 = et12.getText().toString();
		s3 = et13.getText().toString();

		Float n1, n2, n3, r1, r2;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		n3 = Float.parseFloat(s3);

		r1 = n1 * n1 + (2 * n2 * n3);
		r2 = sqrt(r1);

		tvr5.setText(" V^2 = " + r1 + "m/s" + " V = " + r2 + "m/s");

	}

	// ///////////////////POS ANGULAR//////////////////////////////

	public void OnButtonClickedAddAndDisplay6(View v) {

		et14 = (EditText) findViewById(R.id.et14);
		et15 = (EditText) findViewById(R.id.et15);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr6 = (TextView) findViewById(R.id.tvr6);

		String s1, s2;

		s1 = et14.getText().toString();
		s2 = et15.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 / n2;

		tvr6.setText(" φ = " + r1 + "rad");

	}

	// ///////////////////VELOCIDADE ANGULAR//////////////////////////////

	public void OnButtonClickedAddAndDisplay7(View v) {

		et16 = (EditText) findViewById(R.id.et16);
		et17 = (EditText) findViewById(R.id.et17);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr7 = (TextView) findViewById(R.id.tvr7);

		String s1, s2;

		s1 = et16.getText().toString();
		s2 = et17.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 / n2;

		tvr7.setText(" ω = " + r1 + "rad/s");

	}

	// ///////////////////ACELERACAO CENTRIPETA//////////////////////////////

	public void OnButtonClickedAddAndDisplay8(View v) {

		et18 = (EditText) findViewById(R.id.et18);
		et19 = (EditText) findViewById(R.id.et19);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr8 = (TextView) findViewById(R.id.tvr8);

		String s1, s2;

		s1 = et18.getText().toString();
		s2 = et19.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = (n1 * n1) / n2;

		tvr8.setText(" acp = " + r1 + "m/s^2");

	}

	// ///////////////////////FORÇA////////////////////////////////////
	public void OnButtonClickedAddAndDisplay9(View v) {

		et20 = (EditText) findViewById(R.id.et20);
		et21 = (EditText) findViewById(R.id.et21);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr9 = (TextView) findViewById(R.id.tvr9);

		String s1, s2;

		s1 = et20.getText().toString();
		s2 = et21.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 * n2;

		tvr9.setText(" F = " + r1 + "N");

	}

	// ///////////////////////PESO////////////////////////////////////
	public void OnButtonClickedAddAndDisplay10(View v) {

		et22 = (EditText) findViewById(R.id.et22);
		et23 = (EditText) findViewById(R.id.et23);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr10 = (TextView) findViewById(R.id.tvr10);

		String s1, s2;

		s1 = et22.getText().toString();
		s2 = et23.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 * n2;

		tvr10.setText(" P = " + r1 + "N");

	}

	// ///////////////////////
	// ATRITO////////////////////////////////////
	public void OnButtonClickedAddAndDisplay11(View v) {

		et24 = (EditText) findViewById(R.id.et24);
		et25 = (EditText) findViewById(R.id.et25);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr11 = (TextView) findViewById(R.id.tvr11);

		String s1, s2;

		s1 = et24.getText().toString();
		s2 = et25.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 * n2;

		tvr11.setText(" Fat = " + r1 + "N");

	}

	// ///////////////////////Força
	// ELASTICA////////////////////////////////////
	public void OnButtonClickedAddAndDisplay12(View v) {

		et26 = (EditText) findViewById(R.id.et26);
		et27 = (EditText) findViewById(R.id.et27);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr12 = (TextView) findViewById(R.id.tvr12);

		String s1, s2;

		s1 = et26.getText().toString();
		s2 = et27.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 * n2;

		tvr12.setText(" F = " + r1 + "N");

	}

	// ///////////////////////FORCA
	// CENTRIPETA////////////////////////////////////
	public void OnButtonClickedAddAndDisplay13(View v) {

		et28 = (EditText) findViewById(R.id.et28);
		et29 = (EditText) findViewById(R.id.et29);
		et30 = (EditText) findViewById(R.id.et30);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr13 = (TextView) findViewById(R.id.tvr13);

		String s1, s2, s3;

		s1 = et28.getText().toString();
		s2 = et29.getText().toString();
		s3 = et30.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, n3, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		n3 = Float.parseFloat(s3);
		// n3 = Float.parseFloat(s3);

		r1 = n1 * (n2 * n2) / n3;

		tvr13.setText(" Fcp = " + r1 + "N");

	}

	// ///////////////////////TRABALHO////////////////////////////////////
	public void OnButtonClickedAddAndDisplay14(View v) {

		et31 = (EditText) findViewById(R.id.et31);
		et32 = (EditText) findViewById(R.id.et32);
		et33 = (EditText) findViewById(R.id.et33);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr14 = (TextView) findViewById(R.id.tvr14);

		String s1, s2, s3;

		s1 = et31.getText().toString();
		s2 = et32.getText().toString();
		s3 = et33.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2;
		Float n3;
		double r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		n3 = Float.parseFloat(s3);

		r1 = n1 * n2 * (Math.cos(n3 * Math.PI / 180));

		tvr14.setText(" T = " + r1 + "J");

	}

	// ///////////////////////POTENCIA////////////////////////////////////
	public void OnButtonClickedAddAndDisplay15(View v) {

		et34 = (EditText) findViewById(R.id.et34);
		et35 = (EditText) findViewById(R.id.et35);
		// EditText etV = (EditText) findViewById(R.id.etVV);
		tvr15 = (TextView) findViewById(R.id.tvr15);

		String s1, s2;

		s1 = et34.getText().toString();
		s2 = et35.getText().toString();
		// s3 = etV.getText().toString();

		Float n1, n2, r1;

		n1 = Float.parseFloat(s1);
		n2 = Float.parseFloat(s2);
		// n3 = Float.parseFloat(s3);

		r1 = n1 / n2;

		tvr15.setText(" Pot = " + r1 + "W");

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

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
			// case android.R.id.home:
			// app icon in action bar clicked; go home
			// Intent intent = new Intent(this, TabsMenu.class);
			// intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			// startActivity(intent);
			// return true;
		}

		return super.onOptionsItemSelected(item);

	}
}
