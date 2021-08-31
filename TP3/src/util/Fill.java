package util;

import model.*; // Import All classes from model package

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
        for (int i = 0; i < quantProducts; i++) {
            Product profile = fillProfileProduct(i);
            addProfileToDataProduct(profile);
        }
    }

    /**
     * Recebe as informações do produto.
     * 
     * @return Novo profile de produto (name, description, value, profitPercentage,
     *         inStockQuant)
     * @see model.Product
     */
    private static Product fillProfileProduct(int i) {
        i = i + 1;
        String name = "produto" + i;
        String description = "produto" + i;
        double value = i;
        double profitPercentage = i * 10;
        int inStockQuant = i * 2;

        return new Product(name, description, value, profitPercentage, inStockQuant);
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
}
