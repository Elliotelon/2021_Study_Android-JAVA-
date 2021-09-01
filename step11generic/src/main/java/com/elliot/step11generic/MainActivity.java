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

        SampleImpl sampleImpl = new SampleImpl();
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(sampleImpl.testMethod1(10).toString());

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(sampleImpl.testMethod2("Sample"));


    }
}