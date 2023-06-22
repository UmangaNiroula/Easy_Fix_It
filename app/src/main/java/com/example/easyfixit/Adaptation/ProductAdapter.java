package com.example.easyfixit.Adaptation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easyfixit.Interface.SelectListener;
import com.example.easyfixit.ListPage.ProductItem;
import com.example.easyfixit.R;
import com.example.easyfixit.View_Holder.MyViewHolder;
import com.example.easyfixit.View_Holder.ProductViewHolder;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>{

    Context context;
    List<ProductItem> Pitems;
    private SelectListener listener;

    public ProductAdapter(Context context, List<ProductItem> items, SelectListener listener) {
        this.context = context;
        this.Pitems = items;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.product_item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productName.setText(Pitems.get(position).getProductName());
        holder.productPrice.setText(Pitems.get(position).getProductCost());
        holder.productDescription.setText(Pitems.get(position).getProductDescription());
        holder.productBrand.setText(Pitems.get(position).getProductBrand());
        holder.productImage.setImageResource(Pitems.get(position).getImagePath());

        holder.productBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(Pitems.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return Pitems.size();
    }
}
