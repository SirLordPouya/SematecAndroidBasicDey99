package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class TestDynamicFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dynamic_fragment);
        Button btnChange = findViewById(R.id.btnChange);
        FrameLayout frmFragment = findViewById(R.id.frmFragment);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        TestFragment1 frg1 = new TestFragment1();
        ft.replace(R.id.frmFragment, frg1);
        ft.commit();


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                TestFragment2 frg2 = new TestFragment2();
                ft.replace(R.id.frmFragment, frg2);
                ft.commit();
            }
        });
    }
}