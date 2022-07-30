package com.manuni.broadcastrecexpliwithinappcomponentname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcast(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(MainActivity.this,MyBroadcastReceiver.class);
        intent.setComponent(componentName);
        sendBroadcast(intent);
    }
}