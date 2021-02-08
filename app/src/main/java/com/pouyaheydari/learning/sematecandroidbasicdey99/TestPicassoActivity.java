package com.pouyaheydari.learning.sematecandroidbasicdey99;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class TestPicassoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_picasso);

        ImageView imgPicasso = findViewById(R.id.imgPicasso);
        Picasso.get().load("https://square.github.io/picasso/static/sample.png").into(imgPicasso);
    }
}