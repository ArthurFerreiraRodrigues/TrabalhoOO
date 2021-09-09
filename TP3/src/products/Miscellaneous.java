package products;

import model.Product;

public class Miscellaneous extends Product {
    private String name, brand;

    // Constructor

    public Miscellaneous(int id, double price, int inStockQuant, String name, String brand) {
        super(id, price, inStockQuant);
        this.name = name;
        this.brand = brand;
    }

    @Override
    public void list() {

    }

    public void searchByName() {

    }

    public void searchByBrand() {

    }
}
