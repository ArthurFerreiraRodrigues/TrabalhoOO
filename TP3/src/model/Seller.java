package model;

import java.util.ArrayList;
import java.util.List;

import util.Print;
import util.Read;

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
    public List<Sale> getSalesMade() {
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

    // Updater

    public void updateInfo() {
        Print.title("Alterar Dados do Vendedor");
        System.out.printf("Novo ID :");
        id = Read.Int();
        System.out.printf("Novo Nome :");
        name = Read.Line();
    }

    // Searches

    /**
     * Returns the Seller matched by it's identification code
     * 
     * @param searchId
     * @return Matched Seller
     */
    public static Seller searchById(int searchId) {
        for (Seller seller : Data.getSellers()) {
            if (seller.getId() == searchId) {
                return seller;
            }
        }
        return null;
    }

    public ArrayList<Seller> searchByName(String searchName) {
        ArrayList<Seller> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Seller seller : Data.getSellers()) {
            if (seller.getName() == searchName) {
                matches.add(seller);
                hasMatches = true;
            }
        }
        if (hasMatches) {
            return matches;
        } else {
            return null;
        }
    }

}
