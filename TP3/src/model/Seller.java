package model;

import java.util.ArrayList;
import java.util.List;

import util.Print;
import util.Read;
import util.Screen;

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
    int productsSold;

    // Constructor

    public Seller(int id, String name, double cashFlow, int productsSold) {
        this.id = id;
        this.name = name;
        this.cashFlow = cashFlow;
        this.productsSold = productsSold;
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
     * @return How much money the seller made from all sales
     */
    public double getCashFlow() {
        return cashFlow;
    }

    /**
     * @return How many items did the seller sold
     */
    public int getProductsSold() {
        return productsSold;
    }

    // Listers

    public void list() {

    }

    public void listSalesMadeById(int inputId) {
        Seller target = searchById(inputId);

        if (target == null) {
            System.out.printf("Nenhum vendedor encontrado com essa ID.");
        } else {
            System.out.printf(target.name); // Completar
        }
    }

    public void listSalesMadeByName() {

    }

    // Updater

    public void updateInfo() {
        Print.title("Alterar Dados do Vendedor");
        System.out.printf("Novo ID :");
        id = Read.Int();
        System.out.printf("Novo Nome :");
        name = Read.Line();
    }

    private void updateCashFlow(Sale sale) {
        this.cashFlow += sale.getSubTotal();
    }
    // Searches

    /**
     * Returns the Seller matched by it's identification code
     * 
     * @param searchId
     * @return Matched Seller
     */
    public static Seller searchById(int searchId) {
        for (Seller seller : Data.getSellers()) {
            if (seller.getId() == searchId) {
                return seller;
            }
        }
        return null;
    }

    public ArrayList<Seller> searchByName(String searchName) {
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

    // Register

    public void registerSale(Seller selected) {
        Customer buyer;
        Print.title("Cadastro de Nova Venda");

        do {
            System.out.printf("Digite o Nome Completo do Cliente : ");
            String searchName = Read.Line();
            buyer = Customer.searchByName(searchName);
            if (buyer == null) {
                System.out.printf("\nCliente com nome '%s' não encontrado.\n", searchName);
            }
        } while (buyer == null);

        Sale sale = inputProfileSale(selected, buyer);
        selected.updateCashFlow(sale);
        addProfileToDataSales(sale);
    }

    private Sale inputProfileSale(Seller selected, Customer buyer) {
        ArrayList<ProductsSoldInSale> productsSold = new ArrayList<>();
        double subTotal = 0;
        Seller seller = selected;
        Product product;
        int searchId, units, unitsSold = 0, i = 1;

        Screen.clear();
        Print.title("Cadastro de Nova Venda");
        Product.list();
        System.out.printf("Comprador : %s\n", buyer.getName());
        System.out.printf("Digite 0 para encerrar Registro de Venda");
        do {
            System.out.printf("\tProduto %d\n", i);

            do {
                System.out.printf("\t\tID : ");
                searchId = Read.Int();
                product = Product.searchById(searchId);
                if (product == null) {
                    System.out.printf("\t\t\nDigite uma ID válida.\n");
                }
            } while (product == null);

            do {
                System.out.printf("\t\tQuantidade : ");
                units = Read.Int();
                if (units > product.inStockQuant) {
                    System.out.printf("\t\t\nQuantidade vendida ultrapassa estoque.\n");
                }
                if (units <= 0) {
                    System.out.printf("\t\t\nQuantidade vendida deve ser maior que 0.\n");
                }
            } while (units > product.inStockQuant || units <= 0);

            unitsSold += units;
            subTotal += units * product.getPrice();
            product.uptateStockQuant(units);
            productsSold.add(new ProductsSoldInSale(product, units));
            i++;
        } while (searchId == 0);

        buyer.setTimesInStore();
        return new Sale(seller, buyer, productsSold, unitsSold, subTotal);
    }

    public void registerCostumer() {

    }
}
