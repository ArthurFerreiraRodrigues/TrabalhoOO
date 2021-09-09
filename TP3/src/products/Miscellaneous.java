package products;

import java.util.ArrayList;

import model.Data;
import model.Product;

public class Miscellaneous extends Product {
    private String name, brand;

    // Constructor

    public Miscellaneous(int id, double price, int inStockQuant, String name, String brand) {
        super(id, price, inStockQuant);
        this.name = name;
        this.brand = brand;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void list() {

    }

    public ArrayList<Miscellaneous> searchByName(String searchInput) {
        ArrayList<Miscellaneous> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Miscellaneous miscellaneous : Data.getProducts()) {
            if (miscellaneous.getName() == searchInput) {
                matches.add(miscellaneous);
                hasMatches = true;
            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }

    }

    public ArrayList<Miscellaneous> searchByBrand(String searchInput) {
        ArrayList<Miscellaneous> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Miscellaneous miscellaneous : Data.getProducts()) {
            if (miscellaneous.getBrand() == searchInput) {
                matches.add(miscellaneous);
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
