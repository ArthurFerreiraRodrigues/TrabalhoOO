package model;

import util.Print;
import util.Read;

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
    public Customer(String name, String adress, String celNumber, String timesInStore) {
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
     * @return Costumer cellphone number
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
        Print.title("Alterar Dados do Cliente");
        System.out.printf("Novo Nome :");
        name = Read.Line();
        System.out.printf("Novo Endereço :");
        adress = Read.Line();
        System.out.printf("Novo Telefone :");
        celNumber = Read.Line();
    }

    // Lister
    public void list() {

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