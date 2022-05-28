package com.example.bnccmath;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CounterAdapter extends RecyclerView.Adapter<viewHolder>{
    ArrayList<valueOutput> valueOutput_al = new ArrayList<>();
    Context context;

    public CounterAdapter(ArrayList<valueOutput> valueOutput_al) {
        this.valueOutput_al = valueOutput_al;
    }

    public CounterAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        valueOutput tempValueOutput = valueOutput_al.get(position);
        holder.outputValue_adapter.setText(tempValueOutput.getValueOutput());

    }

    @Override
    public int getItemCount() {
        return valueOutput_al.size();
    }
}

class viewHolder extends RecyclerView.ViewHolder {
    TextView outputValue_adapter;

    public viewHolder(@NonNull View itemView) {
        super(itemView);

        outputValue_adapter = itemView.findViewById(R.id.outputValue_layout);

    }
}