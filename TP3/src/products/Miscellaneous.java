package products;

import java.util.ArrayList;

import model.Data;
import model.Product;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see model.Product
 */
public class Miscellaneous extends Product {
    private String name, brand;

    // Constructor

    /**
     * Cria um produto variado
     * 
     * @param id           - int
     * @param price        - double
     * @param inStockQuant - int
     * @param name         - String
     * @param brand        - String
     */
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
    public String toString() {
        return this.getId() + " | Variados | R$ " + this.getPrice() + " | " + this.getInStockQuant() + " | "
                + this.getBrand() + " | " + this.getName();
    }

    // Setter

    public void updateInfo() {
        /*
         * this.id = Read.Int();
         * 
         * this.name = Read.Line();
         * 
         * this.brand = Read.Line();
         * 
         * this.price = Read.Double();
         * 
         * this.inStockQuant = Read.Int();
         */
    }

    // Searches

    /**
     * Searches, by name, for a Product in its Data ArrayList
     * 
     * @param searchInput - String
     * @return miscellaneous or null
     * 
     */
    public static ArrayList<Miscellaneous> searchByName(String searchInput) {
        ArrayList<Miscellaneous> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Miscellaneous) {
                if (((Miscellaneous) product).getName() == searchInput) {
                    matches.add(((Miscellaneous) product));
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
     * Searches, by brand, for a Product in its Data ArrayList
     * 
     * @param searchInput - String
     * @return miscellaneous or null
     * 
     */
    public static ArrayList<Miscellaneous> searchByBrand(String searchInput) {
        ArrayList<Miscellaneous> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Miscellaneous) {
                if (((Miscellaneous) product).getBrand() == searchInput) {
                    matches.add(((Miscellaneous) product));
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
