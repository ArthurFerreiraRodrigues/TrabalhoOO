package products;

import java.util.ArrayList;

import model.Data;
import model.Product;
import util.Print;
import util.Read;

public class Miscellaneous extends Product {
    private String name, brand;

    // Constructor

    public Miscellaneous(int id, double price, int inStockQuant, String name, String brand) {
        super(id, price, inStockQuant);
        this.name = name;
        this.brand = brand;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    // Lister

    public void list() {
        Print.titleAndDescription("Lista de Produtos Variados", "ID | Tipo | Preço | Estoque | Marca | Nome");
        int i = 1;
        for (Product product : Data.getProducts()) {
            if (product instanceof Miscellaneous) {
                System.out.printf("%d. ", i, ((Miscellaneous) product).toString() + "\n");
                i++;
            }
        }
        Print.split();
    }

    @Override
    public String toString() {
        return this.getId() + " | Variados | R$ " + this.getPrice() + " | " + this.getInStockQuant() + " | "
                + this.getBrand() + " | " + this.getName();
    }

    // Setter

    public void updateInfo() {
        Print.title("Alterar Dados de Produtos Variados");
        System.out.printf("Novo Código de Identificação :");
        id = Read.Int();
        System.out.printf("Novo Nome :");
        name = Read.Line();
        System.out.printf("Nova Marca :");
        brand = Read.Line();
        System.out.printf("Novo Preço :");
        price = Read.Double();
        System.out.printf("Nova Quantidade em Estoque :");
        inStockQuant = Read.Int();
    }

    // Searches

    public ArrayList<Miscellaneous> searchByName(String searchInput) {
        ArrayList<Miscellaneous> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Miscellaneous) {
                if (((Miscellaneous) product).getName() == searchInput) {
                    matches.add(((Miscellaneous) product));
                    hasMatches = true;
                }
            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }

    }

    public ArrayList<Miscellaneous> searchByBrand(String searchInput) {
        ArrayList<Miscellaneous> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Miscellaneous) {
                if (((Miscellaneous) product).getBrand() == searchInput) {
                    matches.add(((Miscellaneous) product));
                    hasMatches = true;
                }
            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }

    }
}
