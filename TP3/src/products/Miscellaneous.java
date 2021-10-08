package products;

import java.util.ArrayList;

import model.Data;
import model.Product;
import util.Print;
import util.Read;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see model.Product
 */
public class Miscellaneous extends Product {
    private String name, brand;

    // Constructor

    /**
     * Cria um produto variado
     * 
     * @param id           - int
     * @param price        - double
     * @param inStockQuant - int
     * @param name         - String
     * @param brand        - String
     */
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

    /**
     * 
     */
    public static void list() {
        Print.titleAndDescription("Lista de Produtos Variados", "ID | Tipo | Preço | Estoque | Marca | Nome");
        int i = 1;
        for (Product product : Data.getProducts()) {
            if (product instanceof Miscellaneous) {
                System.out.printf("%d. " + ((Miscellaneous) product).toString() + "\n", i);
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
        this.id = Read.Int();
        System.out.printf("Novo Nome :");
        this.name = Read.Line();
        System.out.printf("Nova Marca :");
        this.brand = Read.Line();
        System.out.printf("Novo Preço :");
        this.price = Read.Double();
        System.out.printf("Nova Quantidade em Estoque :");
        this.inStockQuant = Read.Int();
    }

    // Searches

    /**
     * 
     * @param searchInput - String
     * @return Search Match or Null if there is no matches
     */
    public static ArrayList<Miscellaneous> searchByName(String searchInput) {
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

    public static ArrayList<Miscellaneous> searchByBrand(String searchInput) {
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
