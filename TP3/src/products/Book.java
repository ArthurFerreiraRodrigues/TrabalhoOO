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
    public void list() {

    }

    public void searchByAuthor() {

    }

    public void searchByTitle() {

    }

}
