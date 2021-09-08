package model;

public abstract class Product {
    private int id;
    private double price;
    private int inStockQuant;

    /**
     * Gera o profile do produto
     * 
     * @param id           : Product identification code
     * @param price        : Product price
     * @param inStockQuant : Product quantities in stock
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
        inStockQuant = inStockQuant - quantSold;
    }

    // Lister
    public abstract void list();

    // Search by ID

    /**
     * Returns the Product matched by it's identification code
     * 
     * @param searchId
     * @return Matched Product
     */
    public Product searchById(int searchId) {
        for (Product product : Data.getProducts()) {
            if (product.getId() == searchId) {
                return product;
            }
        }
        return null;
    }
}
