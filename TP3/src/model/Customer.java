package model;

/**
 * Model class of a customer.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class Customer {

    private String name, address;
    private String celNumber;
    private int timesInStore;

    /**
     * Gera o profile do cliente
     * 
     * @param name         : Customer name
     * @param address      : Customer address
     * @param celNumber    : Customer cellphone number
     * @param timesInStore : Number of times a Customer has visited the store
     */
    public Customer(String name, String address, String celNumber) {
        this.name = name;
        this.address = address;
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
     * @return Customer address
     */
    public String getAddress() {
        return address;
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

    public void updateCustomerInfo(String name, String address, String celNumber) {

        this.name = name;
        this.address = address;
        this.celNumber = celNumber;

    }

    // Search

    /**
     * Searches, by name, for a Customer in its Data ArrayList
     * 
     * @param nameCustomer - String
     * @return customer or null
     * 
     */
    public static Customer searchByName(String nameCustomer) {

        for (Customer customer : Data.getCustomers()) {
            if (customer.getName().equals(nameCustomer)) {
                return customer;
            }
        }
        return null;
    }
}