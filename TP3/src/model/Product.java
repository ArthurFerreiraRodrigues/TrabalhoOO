package model;

@SuppressWarnings("unused")

public abstract class Product {
    private int id;
    private double price;
    private int inStockQuant;

    /**
     * Gera o profile do produto
     * 
     * @param id           : identification product code
     * @param price        : valor do produto
     * @param inStockQuant : quantidade em estoque
     */
    public Product(int id, double price, int inStockQuant) {
        this.id = id;
        this.price = price;
        this.inStockQuant = inStockQuant;
    }

    // Getters

    /**
     * @return Nome do Produto
     */
    public abstract int getId();

    /**
     * @return Valor do Produto
     */
    public abstract double getPrice();

    /**
     * @return Quantidade de Unidades do Produto em Estoque
     */
    public abstract int getInStockQuant();

    // Setters

    /**
     * Atualiza quantidade de unidades em estoque.
     * 
     * @param quantSold
     * @see appmain.Register Register.sales()
     */
    public abstract void uptateStockQuant(int quantSold);
}
