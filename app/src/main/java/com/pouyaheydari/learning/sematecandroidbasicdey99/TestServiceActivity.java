package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class TestServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_service);
        Intent intent = new Intent(TestServiceActivity.this, TestService.class);
        ContextCompat.startForegroundService(TestServiceActivity.this,intent);
    }
}