package com.example.easyfixit.Interface;

import com.example.easyfixit.ListPage.Item;
import com.example.easyfixit.ListPage.ProductItem;

public interface SelectListener {

    void onItemClicked(Item item);

    void onItemClicked(ProductItem item);
}
