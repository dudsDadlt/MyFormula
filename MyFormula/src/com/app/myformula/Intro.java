package com.app.myformula;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.*;

public class Intro extends Activity {

    @Override
    protected void onCreate(Bundle intro) { // void = method
        super.onCreate(intro);
        setContentView(R.layout.layout_intro);

        SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        Thread logoTimer = new Thread() { // Thread is good to game development - logotimer e o nome do thread

            @Override
			public void run() {
                try {
                    sleep(2000);
                    Intent menuIntent = new Intent(
                            "com.app.myformula.TABSMENU"); // start activity
                    startActivity(menuIntent);

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally {
                    finish();
                }
            }
        };
        logoTimer.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }

}