package com.elliot.step03sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextSave;
    String shared = "file";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSave = (EditText)findViewById(R.id.editTextSave);

        SharedPreferences sp = getSharedPreferences(shared, MODE_PRIVATE);
        String value = sp.getString("save", "");
        editTextSave.setText(value);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences sp = getSharedPreferences(shared, MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String value = editTextSave.getText().toString();
        editor.putString("save", value);
        editor.commit();

    }
}