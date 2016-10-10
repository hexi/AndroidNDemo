package com.baidao.constraintLayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivityMainDone(View view) {
        startActivity(new Intent(this, ActivityMainDone.class));
    }

    public void startActivityMainAutoConnect(View view) {
        startActivity(new Intent(this, ActivityMainAutoConnect.class));
    }

    public void startActivityMainInference(View view) {
        startActivity(new Intent(this, ActivityMainInference.class));
    }

    public void startActivityMainStart(View view) {
        startActivity(new Intent(this, ActivityMainStart.class));
    }
}
