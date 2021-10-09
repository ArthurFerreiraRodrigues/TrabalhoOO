package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Data structure class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public abstract class Data {
    private static final ArrayList<StoreManager> storeManagers = new ArrayList<>();
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
     * <p>
     * If selected option == 1 -> seller.getName()
     * <p>
     * if == 2 -> seller.getId()
     * 
     * @param sellerList - List<Seller>
     * @param selectOpt  - int
     * @return Object[]
     */
    public static Object[] getSellersInfo(List<Seller> sellerList, int selectOpt) {
        List<String> array = new ArrayList<String>();

        if (selectOpt == 1) {
            for (Seller seller : sellerList) {
                array.add(seller.getName());
            }
        } else if (selectOpt == 2) {
            for (Seller seller : sellerList) {
                array.add(Integer.toString(seller.getId()));
            }
        }
        return array.toArray();
    }

    public static Object[] getCustomersInfo(List<Customer> customerList) {
        List<String> array = new ArrayList<String>();

        for (Customer customer : customerList) {
            array.add(customer.getName());
        }

        return array.toArray();
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