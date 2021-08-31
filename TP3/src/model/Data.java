package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para armazenar dados
 */
public abstract class Data {
    private static final ArrayList<Manager> managers = new ArrayList<>();
    private static final ArrayList<Seller> sellers = new ArrayList<>();
    private static final ArrayList<Customer> customers = new ArrayList<>();
    private static final ArrayList<Product> products = new ArrayList<>();
    private static final ArrayList<Sale> sales = new ArrayList<>();

    /*----------------------------------------------------------------------*/

    /**
     * @return Lista de Gerentes
     */
    public static List<Manager> getManagers() {
        return managers;
    }

    /**
     * @return Lista de Vendedores
     */
    public static List<Seller> getSellers() {
        return sellers;
    }

    /**
     * @return Lista de Produtos
     */
    public static List<Product> getProducts() {
        return products;
    }

    /**
     * @return Lista de Clientes
     */
    public static List<Customer> getCustomers() {
        return customers;
    }

    /**
     * @return Lista de Vendas
     */
    public static List<Sale> getSales() {
        return sales;
    }

    /**
     * @return Tamanho da Lista Clientes
     */
    public static int getSizeOfCustomers() {
        return customers.size();
    }

    /**
     * @return Tamanho da Lista Produtos
     */
    public static int getSizeOfProducts() {
        return products.size();
    }
}