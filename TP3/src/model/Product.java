package model;

/**
 * Model class of a product.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public abstract class Product {
    protected int id;
    protected double price;
    protected int inStockQuant;

    /**
     * Gera o profile do produto
     * 
     * @param id           - int
     * @param price        - double
     * @param inStockQuant - int
     */
    public Product(int id, double price, int inStockQuant) {
        this.id = id;
        this.price = price;
        this.inStockQuant = inStockQuant;
    }

    // Getters

    /**
     * @return Product identification code
     */
    public int getId() {
        return id;
    }

    /**
     * @return Product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return Product quantities in stock
     */
    public int getInStockQuant() {
        return inStockQuant;
    }

    // Setters

    /**
     * Updates quantities of Product in stock.
     * 
     * @param quantSold
     * @see appmain.Register Register.sales()
     */
    public void uptateStockQuant(int quantSold) {
        this.inStockQuant = inStockQuant - quantSold;
    }

    // Search by ID

    /**
     * Returns the Product matched by it's identification code
     * 
     * @param searchId
     * @return Matched Product
     */
    public static Product searchById(int searchId) {
        for (Product product : Data.getProducts()) {
            if (product.getId() == searchId) {
                return product;
            }
        }
        return null;
    }
}
