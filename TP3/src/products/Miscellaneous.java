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
    public int getId() {

        return 0;
    }

    @Override
    public double getPrice() {

        return 0;
    }

    @Override
    public int getInStockQuant() {

        return 0;
    }

    @Override
    public void uptateStockQuant(int quantSold) {

    }

    @Override
    public void list() {

    }

    @Override
    public void searchByID() {

    }

    private void searchByName() {

    }

    private void searchByBrand() {

    }
}
