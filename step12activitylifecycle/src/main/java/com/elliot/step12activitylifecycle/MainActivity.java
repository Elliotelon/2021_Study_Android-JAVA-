package com.elliot.step12activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Activity-Lifecycle", "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity-Lifecycle", "onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity-Lifecycle", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity-Lifecycle", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity-Lifecycle", "onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Activity-Lifecycle", "onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activity-Lifecycle", "onDestroy");
    }
}