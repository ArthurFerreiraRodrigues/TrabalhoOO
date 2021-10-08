package model;

import java.util.ArrayList;

/**
 * Model class of a sale.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class Sale {
    private Seller seller;
    private Customer buyer;
    private ArrayList<ProductsSoldInSale> productsSold = new ArrayList<>();
    private int unitsSold;
    private double subTotal;

    // Constructor

    /**
     * Initialize a sale and updates Seller and Customer statistics.
     * 
     * @param seller       - Seller
     * @param buyer        - Customer
     * @param productsSold - ArrayList<ProductsSoldInSale>
     * @param unitsSold    - int
     * @param subTotal     - double
     * 
     * @see model.ProductsSoldInSale
     */
    public Sale(Seller seller, Customer buyer, ArrayList<ProductsSoldInSale> productsSold, int unitsSold,
            double subTotal) {
        this.seller = seller;
        this.buyer = buyer;
        this.productsSold = productsSold;
        this.unitsSold = unitsSold;
        this.subTotal = subTotal;

        seller.setUnitsSold(unitsSold);
        seller.setCashFlow(subTotal);

        buyer.setTimesInStore();
    }

    // Getters

    public Seller getSeller() {
        return seller;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public ArrayList<ProductsSoldInSale> getProductsSold() {
        return productsSold;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public double getSubTotal() {
        return subTotal;
    }

}
