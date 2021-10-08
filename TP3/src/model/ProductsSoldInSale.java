package model;

/**
 * Helper Model to agregate information.
 * <p>
 * Application : Generate a Sale
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see model.Sale
 * 
 */
public class ProductsSoldInSale {
    private Product productSold;
    private int quantSold;

    /**
     * Constructor for ProductsSoldInSale.
     * 
     * @param productSold - Product
     * @param quantSold   - int
     */
    public ProductsSoldInSale(Product productSold, int quantSold) {
        this.productSold = productSold;
        this.quantSold = quantSold;
    }

    public Product getProductSold() {
        return productSold;
    }

    public int getQuantSold() {
        return quantSold;
    }

}
