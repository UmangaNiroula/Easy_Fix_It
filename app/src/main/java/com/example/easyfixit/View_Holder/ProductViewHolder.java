package com.example.easyfixit.View_Holder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import com.example.easyfixit.R;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder{
    public ImageView productImage;
    public TextView productName;
    public TextView productPrice;
    public TextView productDescription;
    public TextView productBrand;
    public Button productBook;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        productBook = itemView.findViewById(R.id.productBook);
        productBrand = itemView.findViewById(R.id.productBrand);
        productDescription = itemView.findViewById(R.id.productDescription);
        productPrice = itemView.findViewById(R.id.productPrice);
        productName = itemView.findViewById(R.id.productName);
        productImage = itemView.findViewById(R.id.productImage);
    }
}
