package model;

public abstract class Product {
    protected int id;
    protected double price;
    protected int inStockQuant;
    protected String productType;

    /**
     * Gera o profile do produto
     * 
     * @param id           : Product identification code
     * @param price        : Product price
     * @param inStockQuant : Product quantities in stock
     */
    public Product(int id, double price, int inStockQuant, String productType) {
        this.id = id;
        this.price = price;
        this.inStockQuant = inStockQuant;
        this.productType = productType;
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

    public int getProductType() {
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
    public static Product searchById(int searchId) {
        for (Product product : Data.getProducts()) {
            if (product.getId() == searchId) {
                return product;
            }
        }
        return null;
    }
}
