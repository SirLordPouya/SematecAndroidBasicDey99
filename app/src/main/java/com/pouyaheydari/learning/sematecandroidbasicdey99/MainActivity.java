package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle", "onCreate");

        TextView txtTitle = findViewById(R.id.txtTitle);
        Button btnSave = findViewById(R.id.btnSave);
        ImageView imgProfile = findViewById(R.id.imgProfile);
        TextView txtHtml = findViewById(R.id.txtHtml);

        txtTitle.setText("Pouya");
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Item saved!", Toast.LENGTH_LONG).show();
            }
        });

        txtHtml.setText(HtmlCompat.fromHtml("<h2>Title</h2><br><p>Description here</p>", HtmlCompat.FROM_HTML_MODE_COMPACT));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy");
    }
}