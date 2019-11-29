package com.company.Commission;

public class Item {
    private int nrItem;
    private double price;

    //Constructor
    public Item(int nrItem, double price) {
        this.nrItem = nrItem;
        this.price = price;
    }

    //Getters and setters

    public int getNrItem() {
        return nrItem;
    }

    public void setNrItem(int nrItem) {
        this.nrItem = nrItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
