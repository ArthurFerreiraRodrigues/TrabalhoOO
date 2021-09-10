package model;

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
