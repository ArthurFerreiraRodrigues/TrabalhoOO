package model;

import util.Print;
import util.Read;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class Customer {

    private String name, adress;
    private String celNumber;
    private int timesInStore;

    /**
     * Gera o profile do cliente
     * 
     * @param name         : Customer name
     * @param adress       : Customer adress
     * @param celNumber    : Customer cellphone number
     * @param timesInStore : Number of times a Customer has visited the store
     */
    public Customer(String name, String adress, String celNumber) {
        this.name = name;
        this.adress = adress;
        this.celNumber = celNumber;
        this.timesInStore = 0;
    }

    // Getters

    /**
     * @return Customer name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Customer adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @return Customer cellphone number
     */
    public String getCelNumber() {
        return celNumber;
    }

    /**
     * @return Number of times a customer has visited the store
     */
    public int getTimesInStore() {
        return timesInStore;
    }

    // Setters

    /**
     * Increments in ONE the number of times a customer has visited the store
     */
    public void setTimesInStore() {
        this.timesInStore += 1;
    }

    /**
     * Updates Customer Info.
     * 
     * @see appmain.Search
     */
    public void updateCustomerInfo() {
        Print.title("Alterar Cliente");
        System.out.printf("Novo Nome :");
        this.name = Read.Line();
        System.out.printf("Novo Endereço :");
        this.adress = Read.Line();
        System.out.printf("Novo Telefone :");
        this.celNumber = Read.Line();
    }

    // Lister
    public static void list() {
        Print.titleAndDescription("Lista de Clientes", "Nome | Endereço | Telefone | Qtd.Visitas");
        int i = 1;
        for (Customer customer : Data.getCustomers()) {

            System.out.printf("%d. %s | %s | %s | %d\n", i, customer.getName(), customer.getAdress(),
                    customer.getCelNumber(), customer.getTimesInStore());

            i++;
        }
        Print.split();
    }

    // Search

    public static Customer searchByName(String name) {

        for (Customer customer : Data.getCustomers()) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}