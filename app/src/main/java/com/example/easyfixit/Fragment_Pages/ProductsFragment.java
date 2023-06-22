package com.example.easyfixit.Fragment_Pages;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.easyfixit.Adaptation.MyAdapter;
import com.example.easyfixit.Adaptation.ProductAdapter;
import com.example.easyfixit.Interface.SelectListener;
import com.example.easyfixit.ListPage.Item;
import com.example.easyfixit.ListPage.ProductItem;
import com.example.easyfixit.ProductSaleDescription;
import com.example.easyfixit.R;

import java.util.ArrayList;
import java.util.List;

public class ProductsFragment extends Fragment implements SelectListener {

    public List<ProductItem> items;
    public RecyclerView recyclerViewer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_products, container, false);

        recyclerViewer = view.findViewById(R.id.recyclerViewer);

        items =  new ArrayList<ProductItem>();

        setProductItemValue();
        recyclerViewer.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerViewer.setAdapter(new ProductAdapter(requireContext(), items, this));

        return view;
    }

    private void setProductItemValue() {

        String[] productName = {"Solar Water Heater",
                "Sizzle Electric Geyser",
                "Wash Basin",
                "Water Purifier"

        };

        String[] productCost = {"Price: Rs. 42,750",
                "Price: Rs. 11,900",
                "Price: Rs. 7,650",
                "Price: Rs. 5,000"
        };

        String[] productBrand = {"Brand: CG",
                "Brand: Surya",
                "Brand: Silver Table Top",
                "Brand: Kent Ro"
        };

        String[] productDesc = {"The CG Tube Solar Water Heater is a eco-friendly solution that provides efficient and cost-effective water heating solution.",
                "The Surya Sizzle Electric Geyser is built with advanced technology to optimize energy consumption, making it an eco-friendly choice. ",
                "Introducing elegant Silver Table Top Wash Basin, a stunning addition to any bathroom or powder room.",
                "Utilizing advanced Reverse Osmosis (RO) technology, it efficiently removes impurities, contaminants, and harmful substances from the water, ensuring its purity and taste."
        };

        int[] imagePath =  {R.drawable.solarproductnow,
                R.drawable.geyserproductnow,
                R.drawable.basinproductnow,
                R.drawable.filterproductnow
        };

        showItems(productName,productCost,productBrand,productDesc,imagePath);
    }

    private void showItems(String[] productName, String[] productCost, String[] productBrand, String[] productDesc, int[] imagePath) {

        for(int i = 0; i < productName.length; i++)
        {
            items.add(new ProductItem(productName[i],productCost[i],productBrand[i],productDesc[i],imagePath[i]));
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onItemClicked(Item item) {

    }

    @Override
    public void onItemClicked(ProductItem item) {
        Intent intent = new Intent(getContext(), ProductSaleDescription.class);
        intent.putExtra("listen", item.getProductName());
        startActivity(intent);

    }
}