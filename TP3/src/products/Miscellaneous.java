package products;

import model.Product;

public class Miscellaneous extends Product {

    public Miscellaneous(int id, double price, int inStockQuant) {
        super(id, price, inStockQuant);

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
