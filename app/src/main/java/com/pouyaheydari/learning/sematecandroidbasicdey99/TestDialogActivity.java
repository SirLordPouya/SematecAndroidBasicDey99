package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TestDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dialog);

        Button btnAlertDialog = findViewById(R.id.btnAlertDialog);
        Button btnDialogActivity = findViewById(R.id.btnDialogActivity);


        btnDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestDialogActivity.this, TestDialogThemeActivity.class);
                startActivity(intent);
            }
        });

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(TestDialogActivity.this)
                        .setTitle("Dialog Title")
                        .setMessage("Are you sure?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestDialogActivity.this, "Yes Clicked!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestDialogActivity.this, "No Clicked!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("I dont know!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestDialogActivity.this, "I dont know clicked!", Toast.LENGTH_SHORT).show();
                            }
                        }).create();
                dialog.show();
            }
        });
    }
}