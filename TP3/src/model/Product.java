package model;

import products.Book;
import products.Miscellaneous;
import util.Print;

public abstract class Product {
    protected int id;
    protected double price;
    protected int inStockQuant;

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

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStockQuant(int inStockQuant) {
        this.inStockQuant = inStockQuant;
    }

    /**
     * Updates quantities of Product in stock.
     * 
     * @param quantSold
     * @see appmain.Register Register.sales()
     */
    public void uptateStockQuant(int quantSold) {
        this.inStockQuant = inStockQuant - quantSold;
    }

    // Lister
    public static void listInStock() {
        Print.titleAndDescription("Lista de Produtos em Estoque",
                "ID | Tipo | Preço | Estoque | Autor/Marca | Título/Nome");
        for (Product product : Data.getProducts()) {
            if (product.getInStockQuant() > 0) {
                if (product instanceof Book) {
                    System.out.printf(((Book) product).toString() + "\n");
                } else {
                    System.out.printf(((Miscellaneous) product).toString() + "\n");
                }
            }
        }
        Print.split();
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
