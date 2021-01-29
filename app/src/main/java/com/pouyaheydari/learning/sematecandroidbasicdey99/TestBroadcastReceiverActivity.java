package com.pouyaheydari.learning.sematecandroidbasicdey99;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class TestBroadcastReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_broadcast_receiver);

        TestBroadcastReceiver receiver = new TestBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(receiver,filter);


        Intent intent = new Intent();
        intent.setAction("com.pouyaheydari.learning.sematecandroidbasicdey99.CUSTOM_BROADCAST");
        sendBroadcast(intent);

    }
}