package com.example.easyremedy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //check if is first time lanuching the app
        String firstTimeKey = "IS_FIRST_TIME";
        Boolean firstTime = getPreferences(MODE_PRIVATE).getBoolean(firstTimeKey, true);
        if (true) {
            //if is first time run another activity that sets informations
            //runTutorial(); // here you do what you want to do - an activity tutorial in my case
            getPreferences(MODE_PRIVATE).edit().putBoolean(firstTimeKey, false).apply();
            Intent firstSetUp = new Intent(this, SetUpInfo.class);
            this.startActivity(firstSetUp);
        }
    }
}