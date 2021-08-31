package helper;

import model.Costumer;
import model.Dados;
import model.Product;

public class Fill {
    // Costumer

    /**
     * Enche a Lista de Clientes
     */
    public static void costumer() {
        int quantCostumers = 10;
        for (int i = 0; i < quantCostumers; i++) {
            Costumer profile = fillProfileCostumer(i);
            addProfileToDataCostumer(profile);
        }
    }

    /**
     * Recebe as informações do cliente.
     * 
     * @return Novo profile de cliente (name, adress, celNumber)
     * @see model.Costumer
     */
    private static Costumer fillProfileCostumer(int i) {
        i = i + 1;
        String name = "Cliente" + i;
        String adress = "Endereço" + i;
        String celNumber = "" + (i * 25042002 / 2);

        return new Costumer(name, adress, celNumber);
    }

    /**
     * Adiciona parametro "profile" a dados.
     * 
     * @param profile
     * @see model.Dados
     */
    private static void addProfileToDataCostumer(Costumer profile) {
        Dados.getCostumer().add(profile);
    }

    // Product

    /**
     * Enche a Lista de Produtos
     */
    public static void productList() {
        int quantProducts = 10;
        for (int i = 0; i < quantProducts; i++) {
            Product profile = fillProfileProduct(i);
            addProfileToDataProduct(profile);
        }
    }

    /**
     * Recebe as informações do produto.
     * 
     * @return Novo profile de produto (name, description, value, profitPercentage,
     *         inStockQuant)
     * @see model.Product
     */
    private static Product fillProfileProduct(int i) {
        i = i + 1;
        String name = "produto" + i;
        String description = "produto" + i;
        double value = i;
        double profitPercentage = i * 10;
        int inStockQuant = i * 2;

        return new Product(name, description, value, profitPercentage, inStockQuant);
    }

    /**
     * Adiciona parametro "profile" a dados.
     * 
     * @param profile
     * @see model.Dados
     */
    private static void addProfileToDataProduct(Product profile) {
        Dados.getProducts().add(profile);
    }
}
