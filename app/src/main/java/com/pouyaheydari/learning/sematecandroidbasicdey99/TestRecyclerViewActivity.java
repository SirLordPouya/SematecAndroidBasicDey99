package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_view);


        //Fetching data
        ArrayList<String> names = new ArrayList<>();
        names.add("Pouya Heydari");
        names.add("Ali Safaei");
        names.add("Amirhossein Tarkashvand");
        names.add("Edna Kazarian");
        names.add("Koroush Tajik");
        names.add("Mohammadamin Heydarhayi");
        names.add("Nasrin Yousefi");

        RecyclerView recycler = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(TestRecyclerViewActivity.this, RecyclerView.VERTICAL, false);
        recycler.setLayoutManager(manager);
        TestRecyclerAdapter adapter = new TestRecyclerAdapter(names);
        recycler.setAdapter(adapter);
    }
}