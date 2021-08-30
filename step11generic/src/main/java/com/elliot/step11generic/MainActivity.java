package com.elliot.step11generic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test<String> test = new Test();
        test.set("test");
        TextView textView = findViewById(R.id.textView);
        textView.setText(test.get());
    }
}