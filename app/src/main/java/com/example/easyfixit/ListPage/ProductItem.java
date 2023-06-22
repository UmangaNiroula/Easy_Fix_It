package com.example.easyfixit.ListPage;

public class ProductItem {

    String productName;
    String productCost;
    String productBrand;
    String productDescription;
    int imagePath;

    public ProductItem(String productName, String productCost, String productBrand, String productDescription, int imagePath) {
        this.productName = productName;
        this.productCost = productCost;
        this.productBrand = productBrand;
        this.productDescription = productDescription;
        this.imagePath = imagePath;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCost() {
        return productCost;
    }

    public void setProductCost(String productCost) {
        this.productCost = productCost;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }
}
