package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestViewHolder> {

    ArrayList<String> userNames;

    public TestRecyclerAdapter(ArrayList<String> names) {
        userNames = names;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item, parent, false);
        TestViewHolder holder = new TestViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        holder.txtName.setText(userNames.get(position));
    }

    @Override
    public int getItemCount() {
        return userNames.size();
    }
}
