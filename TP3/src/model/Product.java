package model;

@SuppressWarnings("unused")

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
    public abstract int getId();

    /**
     * @return Product price
     */
    public abstract double getPrice();

    /**
     * @return Product quantities in stock
     */
    public abstract int getInStockQuant();

    // Setters

    /**
     * Updates quantities of Product in stock.
     * 
     * @param quantSold
     * @see appmain.Register Register.sales()
     */
    public abstract void uptateStockQuant(int quantSold);

    // Lister
    public abstract void list();

    // Search by ID
    public abstract void searchByID();
}
