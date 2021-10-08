package util;

import java.util.ArrayList;

import model.*; // Import All classes from model package
import products.Book;
import products.Miscellaneous;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 */
public class Fill {
    // Customer

    /**
     * Enche a Lista de Clientes
     */
    public static void customer() {
        int quantCustomers = 10;
        for (int i = 0; i < quantCustomers; i++) {
            Customer profile = fillProfileCustomer(i);
            addProfileToDataCustomer(profile);
        }
    }

    /**
     * Recebe as informações do cliente.
     * 
     * @return Novo profile de cliente (name, adress, celNumber)
     * @see model.Customer
     */
    private static Customer fillProfileCustomer(int i) {
        i = i + 1;
        String name = "Cliente" + i;
        String adress = "Endereço" + i;
        String celNumber = "" + (i * 25042002 / 2);

        return new Customer(name, adress, celNumber);
    }

    /**
     * Adiciona parametro "profile" a data.
     * 
     * @param profile
     * @see model.Data
     */
    private static void addProfileToDataCustomer(Customer profile) {
        Data.getCustomers().add(profile);
    }

    // Product

    /**
     * Enche a Lista de Produtos
     */
    public static void productList() {
        int quantProducts = 10;
        int i;
        for (i = 0; i < quantProducts; i++) {
            Book book = fillProfileBook(i);

            addProfileToDataProduct(book);
        }
        for (int j = i; j < quantProducts + i; j++) {
            Miscellaneous miscellaneous = fillProfileMiscellaneous(j);
            addProfileToDataProduct(miscellaneous);
        }
    }

    /**
     * Recebe as informações do produto.
     * 
     * @return Novo profile de produto (name, description, value, profitPercentage,
     *         inStockQuant)
     * @see model.Product
     */
    private static Book fillProfileBook(int i) {
        i = i + 1;
        int id = i;
        double price = i;
        int inStockQuant = i * 2;
        String author = "Junior" + i;
        String title = "Aventura de " + author;
        String type = "Capa Dura";
        String genre = "Fantasia";

        return new Book(id, price, inStockQuant, author, title, type, genre);
    }

    private static Miscellaneous fillProfileMiscellaneous(int i) {
        i = i + 1;
        int id = i;
        double price = i;
        int inStockQuant = i * 2;

        String name = "Variedade" + i;
        String brand = "FábricaFamosa";
        return new Miscellaneous(id, price, inStockQuant, name, brand);
    }

    /**
     * Adiciona parametro "profile" a data.
     * 
     * @param profile
     * @see model.Data
     */
    private static void addProfileToDataProduct(Product profile) {
        Data.getProducts().add(profile);
    }

    public static void setStoreManager() {
        StoreManager.setCoreStoreManager("Gerente", "Gerente", "Gerente");
    }

    public static void seller() {
        int quantSellers = 10;
        for (int i = 0; i < quantSellers; i++) {
            Seller seller = fillProffileSeller(i);
            Data.getSellers().add(seller);
        }
    }

    private static Seller fillProffileSeller(int i) {
        i = i + 1;
        int id = i;
        double cashFlow = 0;
        String name = "Vendedor" + i;

        int unitsSold = 0;

        return new Seller(id, name, cashFlow, unitsSold);
    }

    public static void sale() {
        int quant = 10;
        for (int i = 0; i < quant; i++) {
            Seller seller = Data.getSellers().get(i);
            Customer customer = Data.getCustomers().get(i);
            Product product = Data.getProducts().get(i);
            Data.getSales().add(fillProfileSale(seller, customer, product));
            Data.getSales().add(fillProfileSale(seller, customer, product));
        }
    }

    private static Sale fillProfileSale(Seller seller, Customer customer, Product product) {

        ArrayList<ProductsSoldInSale> productsSold = new ArrayList<>();
        productsSold.add(new ProductsSoldInSale(product, 2));
        int unitsSold = 2;
        double subTotal = 200;
        return new Sale(seller, customer, productsSold, unitsSold, subTotal);
    }

}
