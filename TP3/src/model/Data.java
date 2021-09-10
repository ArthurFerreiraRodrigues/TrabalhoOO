package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Dataa Storage Class
 */
public abstract class Data {
    private static final ArrayList<StoreManager> storeManagers = new ArrayList<>(1);
    private static final ArrayList<Seller> sellers = new ArrayList<>();
    private static final ArrayList<Customer> customers = new ArrayList<>();
    private static final ArrayList<Product> products = new ArrayList<>();
    private static final ArrayList<Sale> sales = new ArrayList<>();

    /**
     * Private constructor to protect all information
     */
    private Data() {
    }

    /*----------------------------------------------------------------------*/

    /**
     * @return List of Store Managers
     */
    public static List<StoreManager> getStoreManagers() {
        return storeManagers;
    }

    /**
     * @return List of Sellers
     */
    public static List<Seller> getSellers() {
        return sellers;
    }

    /**
     * @return List of Products
     */
    public static List<Product> getProducts() {
        return products;
    }

    /**
     * @return List of Customers
     */
    public static List<Customer> getCustomers() {
        return customers;
    }

    /**
     * @return List of Sales
     */
    public static List<Sale> getSales() {
        return sales;
    }

    /*----------------------------------------------------------------------*/

    /**
     * @return Size of Store Managers list
     */
    public static int getSizeOfStoreManagers() {
        return storeManagers.size();
    }

    /**
     * @return Tamanho da Lista de Vendedores
     */
    public static int getSizeOfSellers() {
        return sellers.size();
    }

    /**
     * @return Tamanho da Lista de Produtos
     */
    public static int getSizeOfProducts() {
        return products.size();
    }

    /**
     * @return Tamanho da Lista de Clientes
     */
    public static int getSizeOfCustomers() {
        return customers.size();
    }

    /**
     * @return Tamanho da Lista de Vendas
     */
    public static int getSizeOfSales() {
        return sales.size();
    }
}