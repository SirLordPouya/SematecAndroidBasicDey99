package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class TestDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);

        EditText edtName = findViewById(R.id.edtName);
        EditText edtFamily = findViewById(R.id.edtFamily);
        EditText edtAge = findViewById(R.id.edtAge);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnShow = findViewById(R.id.btnShow);

        TestSQLiteHelper helper = new TestSQLiteHelper(TestDatabaseActivity.this, "sematec", null, 1);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String family = edtFamily.getText().toString();
                int age = Integer.parseInt(edtAge.getText().toString());
                helper.insertIntoStudents(name, family, age);
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> names = helper.getStudentsNames();
                for (int i = 0; i < names.size(); i++) {
                    Toast.makeText(TestDatabaseActivity.this, names.get(i), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}