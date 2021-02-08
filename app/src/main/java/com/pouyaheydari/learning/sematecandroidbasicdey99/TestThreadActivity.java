package com.pouyaheydari.learning.sematecandroidbasicdey99;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);

        // Main Thread
        System.out.println(Thread.currentThread().getName());

        // Another Thread
        TestThreadClass thread = new TestThreadClass();
        thread.start();

        //Another Thread
        TestRunnableClass runnable = new TestRunnableClass();
        Thread newThread = new Thread(runnable);
        newThread.start();
    }
}