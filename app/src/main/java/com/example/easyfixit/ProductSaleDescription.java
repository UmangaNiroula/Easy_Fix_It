package com.example.easyfixit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.easyfixit.Fragment_Pages.HomeFragment;
import com.example.easyfixit.Fragment_Pages.ProductsFragment;

public class ProductSaleDescription extends AppCompatActivity implements View.OnClickListener {

    private Button backRow;
    private ImageView imageProduct;
    private TextView nameProduct;
    private TextView namePrice;
    private TextView descProduct;
    private TextView feature1,feature2,feature3,feature4;
    private Button bookProduct;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_sale_description);

        backRow = findViewById(R.id.cancelProduct);
        imageProduct = findViewById(R.id.imageProducts);
        nameProduct = findViewById(R.id.nameProduct);
        namePrice = findViewById(R.id.namePrice);
        descProduct = findViewById(R.id.descProduct);
        feature1 = findViewById(R.id.feature1);
        feature2 = findViewById(R.id.feature2);
        feature3 = findViewById(R.id.feature3);
        feature4 = findViewById(R.id.feature4);
        bookProduct = findViewById(R.id.bookButton);

        value = getIntent().getStringExtra("listen");
        setDescription(value);

        backRow.setOnClickListener(this);
        bookProduct.setOnClickListener(this);

    }

    private void setDescription(String value) {

        switch (value)
        {
            case "Solar Water Heater":
                imageProduct.setImageResource(R.drawable.solarproductnow);
                nameProduct.setText(value);
                namePrice.setText("Rs. 42,750");
                descProduct.setText("The Solar Tube Water Heater is an innovative and eco-friendly solution for heating water using the power of the sun. Designed with advanced technology, this system harnesses solar energy to provide efficient and cost-effective hot water for various applications. The solar tubes, strategically placed on rooftops or open areas, absorb sunlight and convert it into heat energy, which is then transferred to the water circulating within the system. This ensures a continuous supply of hot water without relying on traditional energy sources.");
                feature1.setText("1. Free Delivery & Installation");
                feature2.setText("2. Seven Years Warranty");
                feature3.setText("3. No Rust Guaranteed");
                feature4.setText("4. Stainless Steel Body");
                break;

            case "Sizzle Electric Geyser":
                imageProduct.setImageResource(R.drawable.geyserproductnow);
                nameProduct.setText(value);
                namePrice.setText("Rs. 11,900");
                descProduct.setText("Surya Electric Geyser is a high-quality and efficient water heating solution that brings comfort and convenience to your daily routine. Designed with state-of-the-art technology, this electric geyser provides quick and consistent hot water supply for your bathing and household needs. With its powerful heating elements and advanced insulation, it ensures fast heating and retains the warmth for longer durations, saving both energy and time. The Surya Electric Geyser is equipped with essential safety features such as a thermostat and pressure relief valve to prevent overheating and maintain optimal water temperature.");
                feature1.setText("1. Free Delivery & Installation");
                feature2.setText("2. Three Years Warranty");
                feature3.setText("3. Heavy Duty Copper Heating");
                feature4.setText("4. South Asia 5 Star Rating");
                break;

            case "Wash Basin":
                imageProduct.setImageResource(R.drawable.basinproductnow);
                nameProduct.setText(value);
                namePrice.setText("Rs. 7,600");
                descProduct.setText("Introducing our sleek and elegant wash basin, designed to elevate your bathroom experience. With its generous dimensions of 18 inches in width and 12 inches in depth, this wash basin offers ample space for all your cleansing needs. Crafted from high-quality ceramic, it ensures durability and long-lasting performance. The smooth and glossy finish adds a touch of sophistication to your bathroom decor. Equipped with a convenient single faucet hole, it seamlessly accommodates your choice of faucet, allowing for easy installation. The basin's sleek design not only enhances functionality but also complements a wide range of interior styles. With this perfectly sized wash basin, enjoy a refreshing and luxurious washing experience every time you step into your bathroom.");
                feature1.setText("1. Free Delivery ");
                feature2.setText("2. One Years Warranty");
                feature3.setText("2. No Installation or Extra Fee");
                feature4.setText("3. Free Tap Installation");
                break;

            case "Water Purifier":
                imageProduct.setImageResource(R.drawable.filterproductnow);
                nameProduct.setText(value);
                namePrice.setText("Rs. 5,000");
                descProduct.setText("The Kent RO water purifier is a high-quality and innovative water filtration system that provides clean, safe, and refreshing drinking water. Equipped with advanced Reverse Osmosis (RO) technology, it effectively eliminates impurities, bacteria, viruses, chemicals, and other harmful substances present in the water, ensuring its purity and healthiness.This state-of-the-art purifier employs a multi-stage purification process that includes sediment filtration, activated carbon filtration, RO membrane filtration, and UV disinfection.");
                feature1.setText("1. Free Delivery & Installation ");
                feature2.setText("2. One Years Warranty");
                feature3.setText("2. 100% Authentic Product");
                feature4.setText("3. Free Tap Installation");
                break;
        }
    }


    @Override
    public void onClick(View v) {

        if(v.getId() ==  R.id.cancelProduct)
        {
            Intent cancel = new Intent(ProductSaleDescription.this,HomePage.class);
            startActivity(cancel);
        }

        else if(v.getId() == R.id.bookButton)
        {
            Toast.makeText(this, "Booked", Toast.LENGTH_SHORT).show();
        }

    }
}