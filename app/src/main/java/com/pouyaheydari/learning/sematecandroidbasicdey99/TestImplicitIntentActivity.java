package com.pouyaheydari.learning.sematecandroidbasicdey99;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class TestImplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_implicit_intent);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pouyaheydari.com"));
        startActivity(intent);
    }
}