package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestExplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_explicit_intent);

        EditText edtName = findViewById(R.id.edtName);
        Button btnSave = findViewById(R.id.btnSave);

        Intent intent = getIntent();
        String age = intent.getStringExtra("age");
        Toast.makeText(TestExplicitIntentActivity.this, age, Toast.LENGTH_SHORT).show();


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                Intent intent1 = new Intent();
                intent1.putExtra("name", name);
                setResult(Activity.RESULT_OK, intent1);
                finish();
            }
        });
    }
}