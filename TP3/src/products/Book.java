package products;

import model.Product;

public class Book extends Product {
    private String author, title, type, genre;

    // Costructor

    public Book(int id, double price, int inStockQuant, String author, String title, String type, String genre) {
        super(id, price, inStockQuant);
        this.author = author;
        this.title = title;
        this.type = type;
        this.genre = genre;
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

    private void searchByAuthor() {

    }

    private void searchByTitle() {

    }

}
