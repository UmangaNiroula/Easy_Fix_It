package com.example.easyfixit.Adaptation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easyfixit.R;
import com.example.easyfixit.ServiceDetails.Item;
import com.example.easyfixit.View_Holder.MyViewHolder;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.serviceName.setText(items.get(position).getServiceName());
        holder.servicePrice.setText(items.get(position).getEstimateServiceCost());
        holder.serviceDescription.setText(items.get(position).getServiceDescription());
        holder.serviceTime.setText(items.get(position).getEstimateTime());
        holder.serviceImage.setImageResource(items.get(position).getImagePath());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
