package com.app.ostiarius.trialapplicationframeworks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View homeicon = findViewById(R.id.home_icon);
        homeicon.setOnClickListener(this);
        View hometext = findViewById(R.id.home_text);
        hometext.setOnClickListener(this);
        View alertsicon = findViewById(R.id.alert_icon);
        alertsicon.setOnClickListener(this);
        View alertstext = findViewById(R.id.alerts_text);
        alertstext.setOnClickListener(this);
        View settingsicon =  findViewById(R.id.settings_icon);
        settingsicon.setOnClickListener(this);
        View settingstext = findViewById(R.id.settings_text);
        settingstext.setOnClickListener(this);
        View searchicon = findViewById(R.id.search_icon);
        searchicon.setOnClickListener(this);
        View searchtext = findViewById(R.id.search_text);
        searchtext.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_icon:
                startActivity(new Intent(this, MainActivity.class));

            case R.id.home_text:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.alert_icon:
                startActivity(new Intent(this, AlertsActivity.class));

            case R.id.alerts_text:
                startActivity(new Intent(this, AlertsActivity.class));
                break;
////          Upon later implementation
//            case R.id.settings_icon:
//                startActivity(new Intent(this, SettingsActivity.class));
//
//            case R.id.settings_text:
//                startActivity(new Intent(this, SettingsActivity.class));
//                break;
//
//            case R.id.search_icon:
//                startActivity(new Intent(this, SearchActivity.class));
//
//            case R.id.search_text:
//                startActivity(new Intent(this, SearchActivity.class));
//                break;
        }

    }
}
