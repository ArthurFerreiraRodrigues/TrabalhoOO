package model;

import java.util.ArrayList;

public class Seller {
    int id;
    String name;
    private static final ArrayList<Sale> salesMade = new ArrayList<>();
    /**
     * How much money the seller made from all sales
     */
    double cashFlow;
    /**
     * How many items did the seller sold
     */
    int productsSold;

    // Constructor

    public Seller(int id, String name, double cashFlow, int productsSold) {
        this.id = id;
        this.name = name;
        this.cashFlow = cashFlow;
        this.productsSold = productsSold;
    }

    // Getters

    /**
     * @return Seller identification code (int)
     */
    public int getId() {
        return id;
    }

    /**
     * @return Seller name
     */
    public String getName() {
        return name;
    }

    /**
     * @return One ArrayList of sales that a Seller made
     */
    public ArrayList<Sale> getSalesMade() {
        return salesMade;
    }

    /**
     * @return How much money the seller made from all sales
     */
    public double getCashFlow() {
        return cashFlow;
    }

    /**
     * @return How many items did the seller sold
     */
    public int getProductsSold() {
        return productsSold;
    }

    // Setters

    // Listers

    public void list() {

    }

    public void listSalesMadeById(int inputId) {
        Seller target = searchById(inputId);

        if (target == null) {
            System.out.printf("Nenhum vendedor encontrado com essa ID.");
        } else {
            System.out.printf(target.name); // Completar
        }
    }

    public void listSalesMadeByName() {

    }

    // Search

    /**
     * Returns the Seller matched by it's identification code
     * 
     * @param searchId
     * @return Matched Seller
     */
    public Seller searchById(int searchId) {
        for (Seller seller : Data.getSellers()) {
            if (seller.getId() == searchId) {
                return seller;
            }
        }
        return null;
    }

    public void searchByName() {

    }

}
