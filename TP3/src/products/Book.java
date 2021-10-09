package products;

import java.util.ArrayList;

import model.Data;
import model.Product;

/**
 * Model class of a book.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see model.Product
 */
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

    // Lister

    @Override
    public String toString() {
        return this.getId() + " | Livro | R$ " + this.getPrice() + " | " + this.getInStockQuant() + " | "
                + this.getAuthor() + " | " + this.getTitle();
    }

    // Setter

    public void updateInfo() {
        /*
         * this.id = Read.Int();
         * 
         * this.author = Read.Line();
         * 
         * this.title = Read.Line();
         * 
         * this.type = Read.Line();
         * 
         * this.genre = Read.Line();
         * 
         * this.price = Read.Double();
         * 
         * this.inStockQuant = Read.Int();
         */
    }

    // Searches
    /**
     * Searches, by author, for a Product in its Data ArrayList
     * 
     * @param searchInput
     * @return book or null
     * 
     */
    public static ArrayList<Book> searchByAuthor(String searchInput) {
        ArrayList<Book> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Book) {
                if (((Book) product).getAuthor() == searchInput) {
                    matches.add(((Book) product));
                    hasMatches = true;
                }

            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }
    }

    /**
     * Searches, by title, for a Product in its Data ArrayList
     * 
     * @param searchInput
     * @return book or null
     * 
     */
    public static ArrayList<Book> searchByTitle(String searchInput) {
        ArrayList<Book> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Book) {
                if (((Book) product).getTitle() == searchInput) {
                    matches.add(((Book) product));
                    hasMatches = true;
                }
            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }
    }

}
