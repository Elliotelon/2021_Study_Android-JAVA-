package com.elliot.step05listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);

        data.add("text1");
        data.add("text2");
        data.add("text3");
        data.add("text4");
        data.add("text5");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");
        data.add("text6");

        adapter.notifyDataSetChanged();
    }
}