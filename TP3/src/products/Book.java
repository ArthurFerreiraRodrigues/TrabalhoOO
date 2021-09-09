package products;

import java.util.ArrayList;

import model.Data;
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

    // Getters

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void list() {

    }

    public ArrayList<Book> searchByAuthor(String searchInput) {
        ArrayList<Book> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Book book : Data.getProducts()) {
            if (book.getAuthor() == searchInput) {
                matches.add(book);
                hasMatches = true;
            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }
    }

    public ArrayList<Book> searchByTitle(String searchInput) {
        ArrayList<Book> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Book book : Data.getProducts()) {
            if (book.getTitle() == searchInput) {
                matches.add(book);
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
