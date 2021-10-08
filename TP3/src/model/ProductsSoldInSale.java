package model;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class ProductsSoldInSale {
    private Product productSold;
    private int quantSold;

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
