package com.alobot.dummycheckifactivityisontop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCheckActivity(View view) {
        if (Utilities.isActivityOnTop(this, MainActivity.class)) {
            Toast.makeText(this, "MainActivity is on Top", Toast.LENGTH_SHORT).show();
        }
    }
}
