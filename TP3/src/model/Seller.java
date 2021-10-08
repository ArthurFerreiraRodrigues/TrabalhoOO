package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model class of a seller.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class Seller {
    int id;
    String name;
    private static final ArrayList<Sale> salesMade = new ArrayList<>();
    /**
     * How much money the seller made from all sales
     */
    double cashFlow;
    /**
     * How many items did the seller sold
     */
    int unitsSold;

    // Constructor

    public Seller(int id, String name, double cashFlow, int unitsSold) {
        this.id = id;
        this.name = name;
        this.cashFlow = cashFlow;
        this.unitsSold = unitsSold;
    }

    // Getters

    /**
     * @return Seller identification code (int)
     */
    public int getId() {
        return id;
    }

    /**
     * @return Seller name
     */
    public String getName() {
        return name;
    }

    /**
     * @return One ArrayList of sales that a Seller made
     */
    public List<Sale> getSalesMade() {
        return salesMade;
    }

    /**
     * 
     * @return How much money the seller made from all sales
     */
    public double getCashFlow() {
        return cashFlow;
    }

    /**
     * @return How many items did the seller sold
     */
    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold += unitsSold;
    }

    public void setCashFlow(double subTotal) {
        this.cashFlow += subTotal;
    }

    public List<Sale> getSales(List<Sale> sales) {
        List<Sale> sellerSales = new ArrayList<Sale>();

        for (Sale sale : sales) {
            if (sale.getSeller().getId() == this.getId()) {
                sellerSales.add(sale);
            }
        }

        return sellerSales;

    }
    // Updater

    /**
     * Updates a Seller's name and id
     */
    public void updateInfo() {

        /*
         * this.id
         * 
         * this.name
         */
    }

    private void updateCashFlow(Sale sale) {
        this.cashFlow += sale.getSubTotal();
    }
    // Searches

    /**
     * Returns the Seller matched by it's identification code
     * 
     * @param searchId
     * @return seller or null
     */
    public static Seller searchById(int searchId) {
        for (Seller seller : Data.getSellers()) {
            if (seller.getId() == searchId) {
                return seller;
            }
        }
        return null;
    }

    public static ArrayList<Seller> searchByName(String searchName) {
        ArrayList<Seller> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Seller seller : Data.getSellers()) {
            if (seller.getName() == searchName) {
                matches.add(seller);
                hasMatches = true;
            }
        }
        if (hasMatches) {
            return matches;
        } else {
            return null;
        }
    }

    // Adders
    private static void addProfileToDataSales(Sale profile) {
        Data.getSales().add(profile);
    }

    private static void addProfileToDataCustumers(Customer profile) {
        Data.getCustomers().add(profile);
    }

    // Register

    /*
     * public void registerSale() { Customer buyer; Print.title("Registrar Venda");
     * System.out.printf("Vendedor %d : %s\n", this.id, this.name); do {
     * System.out.printf("Digite o Nome Completo do Cliente : "); String searchName
     * = Read.Line(); buyer = Customer.searchByName(searchName); if (buyer == null)
     * { System.out.printf("\nCliente com nome '%s' não encontrado.\n", searchName);
     * } } while (buyer == null);
     * 
     * Sale sale = inputProfileSale(this, buyer); this.updateCashFlow(sale);
     * addProfileToDataSales(sale);
     * 
     * Screen.clear(); System.out.printf("Venda Realiza com Sucesso.");
     * Screen.pressEnterCont(); }
     * 
     * private Sale inputProfileSale(Seller seller, Customer buyer) {
     * ArrayList<ProductsSoldInSale> productsSold = new ArrayList<>(); double
     * subTotal = 0; Product product; int searchId, units, unitsSold = 0, i = 1;
     * 
     * Screen.clear(); Print.title("Registrar Venda"); Product.listInStock();
     * System.out.printf("Comprador : %s\n", buyer.getName());
     * System.out.printf("Digite 0 para encerrar Registro de Venda"); do {
     * System.out.printf("\tProduto %d\n", i);
     * 
     * do { System.out.printf("\t\tID : "); searchId = Read.Int(); product =
     * Product.searchById(searchId); if (product == null) {
     * System.out.printf("\t\t\nDigite uma ID válida.\n"); } } while (product ==
     * null);
     * 
     * do { System.out.printf("\t\tQuantidade : "); units = Read.Int(); if (units >
     * product.inStockQuant) {
     * System.out.printf("\t\t\nQuantidade vendida ultrapassa estoque.\n"); } if
     * (units <= 0) {
     * System.out.printf("\t\t\nQuantidade vendida deve ser maior que 0.\n"); } }
     * while (units > product.inStockQuant || units <= 0); seller.unitsSold +=
     * units; unitsSold += units; subTotal += units * product.getPrice();
     * product.uptateStockQuant(units); productsSold.add(new
     * ProductsSoldInSale(product, units)); i++; } while (searchId == 0);
     * 
     * buyer.setTimesInStore(); return new Sale(seller, buyer, productsSold,
     * unitsSold, subTotal); }
     * 
     * public void registerCustomer() { Print.title("Registrar Cliente");
     * System.out.printf("Vendedor %d : %s\n", this.id, this.name);
     * 
     * Customer customer = inputProfileCustomer();
     * addProfileToDataCustumers(customer); Screen.clear();
     * System.out.printf("Registro de Cliente Realizado com Sucesso.");
     * Screen.pressEnterCont(); }
     * 
     * private Customer inputProfileCustomer() { System.out.printf("\nCliente %d\n",
     * Data.getSizeOfCustomers() + 1);
     * 
     * System.out.print("\tNome : "); String name = Read.Line();
     * System.out.print("\tEndereço : "); String adress = Read.Line();
     * System.out.print("\tTelefone : "); String celNumber = Read.Line();
     * 
     * return new Customer(name, adress, celNumber); }
     * 
     * public void updateCustomer() { Customer customer;
     * 
     * Print.title("Atualizar Cliente"); Customer.list(); do {
     * System.out.printf("Digite o Nome do Cliente : "); String searchName =
     * Read.Line(); customer = Customer.searchByName(searchName); if (customer ==
     * null) { System.out.printf("\nNenhum Cliente Encontrado com o Nome '%s'.\n",
     * searchName); } } while (customer == null); customer.updateCustomerInfo();
     * 
     * Screen.clear();
     * System.out.printf("Atualização de Cliente Realizada com Sucesso.");
     * Screen.pressEnterCont(); }
     */
}
