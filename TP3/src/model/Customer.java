package model;

import util.Print;
import util.Read;

public class Customer {

    private String name, adress;
    private String celNumber;

    /**
     * Gera o profile do cliente
     * 
     * @param name      : nome do cliente
     * @param adress    : endereco do cliente
     * @param celNumber : numero de telefone do cliente
     */
    public Customer(String name, String adress, String celNumber) {
        this.name = name;
        this.adress = adress;
        this.celNumber = celNumber;
    }

    // Getters

    /**
     * @return Nome do Cliente
     */
    public String getName() {
        return name;
    }

    /**
     * @return Endereço do Cliente
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @return Telefone do Cliente
     */
    public String getCelNumber() {
        return celNumber;
    }

    // Setters

    /**
     * Atualiza Cadastro do Cliente.
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

}