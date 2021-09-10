package model;

import java.util.ArrayList;

public class Sale {
    private Seller seller;
    private Customer buyer;
    private ArrayList<ProductsSoldInSale> productsSold = new ArrayList<>();
    private int unitsSold;
    private double subTotal;

    // Constructor

    public Sale(Seller seller, Customer buyer, ArrayList<ProductsSoldInSale> productsSold, int unitsSold,
            double subTotal) {
        this.seller = seller;
        this.buyer = buyer;
        this.productsSold = productsSold;
        this.unitsSold = unitsSold;
        this.subTotal = subTotal;
    }

    // Getters

    public Seller getseller() {
        return seller;
    }

    public Customer getbuyer() {
        return buyer;
    }

    public ArrayList<ProductsSoldInSale> getproductsSold() {
        return productsSold;
    }

    public int getunitsSold() {
        return unitsSold;
    }

    public double getSubTotal() {
        return subTotal;
    }

    // Lister

    public void list() {

    }
}
