package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestSharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_preferences);

        Button btnSave = findViewById(R.id.btnSave);
        EditText edtName = findViewById(R.id.edtName);
        TextView txtName = findViewById(R.id.txtName);

        String name = getSharedPreferences("sematec", Context.MODE_PRIVATE).getString("name","No name available!");
        txtName.setText(name);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                getSharedPreferences("sematec", Context.MODE_PRIVATE).edit().putString("name", name).apply();
            }
        });
    }
}