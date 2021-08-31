package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para armazenar dados
 */
public abstract class Data {
    private static final ArrayList<Customer> customers = new ArrayList<>();
    private static final ArrayList<Product> products = new ArrayList<>();

    /**
     * @return Lista de Clientes
     */
    public static List<Customer> getCustomer() {
        return customers;
    }

    /**
     * @return Lista de Produtos
     */
    public static List<Product> getProducts() {
        return products;
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