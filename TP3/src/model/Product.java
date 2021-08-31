package model;

import util.Print;
import util.Read;

public class Product {
    private String name;
    private String description;
    private double value;
    private double profitPercentage;
    private int inStockQuant;

    /**
     * Gera o profile do produto
     * 
     * @param name             : nome do produto
     * @param description      : descricao do produto
     * @param value            : valor do produto
     * @param profitPercentage : porcentagem de lucro
     * @param inStockQuant     : quantidade em estoque
     */
    public Product(String name, String description, double value, double profitPercentage, int inStockQuant) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.profitPercentage = profitPercentage;
        this.inStockQuant = inStockQuant;
    }

    // Getters

    /**
     * @return Nome do Produto
     */
    public String getName() {
        return name;
    }

    /**
     * @return Descrição do Produto
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return Valor do Produto
     */
    public double getValue() {
        return value;
    }

    /**
     * @return Porcentagem de Lucro do Produto
     */
    public double getProfitPercentage() {
        return profitPercentage;
    }

    /**
     * @return Quantidade de Unidades do Produto em Estoque
     */
    public int getInStockQuant() {
        return inStockQuant;
    }

    // Setters

    /**
     * Atualiza quantidade de unidades em estoque.
     * 
     * @param quantSold
     * @see appmain.Register Register.sales()
     */
    public void uptateStockQuant(int quantSold) {
        inStockQuant = inStockQuant - quantSold;

    }

    /**
     * Atualiza Cadastro do Produto.
     * 
     * @see appmain.Search
     */
    public void updateProductInfo() {
        Print.titulo("Alterar Dados do Produto");
        System.out.printf("Novo Nome :");
        name = Read.Line();
        System.out.printf("Nova Descrição :");
        description = Read.Line();
        System.out.printf("Novo Valor : R$ ");
        value = Read.Double();
        System.out.printf("Nova Procentagem de Lucro (0-100 %) : ");
        value = Read.Double();
        System.out.printf("Nova Quantidade em Estoque : ");
        inStockQuant = Read.Int();
    }
}
