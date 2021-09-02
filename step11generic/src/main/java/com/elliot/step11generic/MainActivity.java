package com.elliot.step11generic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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

        TestGeneric<String> stringType = new TestGeneric<String>();
        TestGeneric<Integer> integerType = new TestGeneric<Integer>();

        stringType.sample = "Hello";
        integerType.sample = 1;

        stringType.showYourType();
        integerType.showYourType();

        List<String> list = new ArrayList<String>();
        TestMethod.method(list, "listTest");


    }
}