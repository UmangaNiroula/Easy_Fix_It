package com.example.easyfixit.View_Holder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easyfixit.R;

public class MyViewHolder extends RecyclerView.ViewHolder {


    public ImageView serviceImage;
    public TextView serviceName;
    public TextView servicePrice;
    public TextView serviceDescription;
    public TextView serviceTime;
    public Button serviceAdd;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        serviceImage = itemView.findViewById(R.id.serviceImage);
        serviceName = itemView.findViewById(R.id.serviceName);
        servicePrice = itemView.findViewById(R.id.servicePrice);
        serviceDescription = itemView.findViewById(R.id.serviceDescription);
        serviceTime = itemView.findViewById(R.id.serviceTime);
        serviceAdd = itemView.findViewById(R.id.serviceAdd);
    }
}
