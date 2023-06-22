package com.example.easyfixit.ListPage;

public class Item {

    String serviceName;
    String estimateServiceCost;
    String estimateTime;
    String serviceDescription;
    int imagePath;

    public Item(String serviceName, String estimateServiceCost, String estimateTime, String serviceDescription, int imagePath) {
        this.serviceName = serviceName;
        this.estimateServiceCost = estimateServiceCost;
        this.estimateTime = estimateTime;
        this.serviceDescription = serviceDescription;
        this.imagePath = imagePath;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getEstimateServiceCost() {
        return estimateServiceCost;
    }

    public void setEstimateServiceCost(String estimateServiceCost) {
        this.estimateServiceCost = estimateServiceCost;
    }

    public String getEstimateTime() {
        return estimateTime;
    }

    public void setEstimateTime(String estimateTime) {
        this.estimateTime = estimateTime;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }
}
