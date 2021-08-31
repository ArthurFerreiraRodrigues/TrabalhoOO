package helper;

import model.Costumer;
import model.Dados;
import model.Product;

public class Print {

    /**
     * Imprime espaços ate que a palavra esteja ao centro.
     * 
     * @param tamTexto,tamDivisor
     */
    private static void printEspacoMeio(int tamTexto, int tamDivisor) {

        int quantEspacos, i;
        quantEspacos = (tamDivisor - tamTexto) / 2;

        for (i = 0; i < quantEspacos; i++) {
            System.out.printf(" ");
        }

    }

    /**
     * Cria uma linha e "-" no terminal.
     */
    public static void split() {
        System.out.printf("\n------------------------------------------------------------\n");
    }

    /**
     * Imprime uma string ao centro da linha.
     * 
     * @param titulo
     */
    public static void titulo(String titulo) {
        Print.split();
        Print.printEspacoMeio(titulo.length(), 60);
        System.out.print(titulo);
        Print.split();
    }

    /**
     * Imprime uma string ao centro da linha.
     * 
     * @param titulo,description
     */
    public static void tituloAndDescription(String titulo, String description) {
        Print.split();
        Print.printEspacoMeio(titulo.length(), 60);
        System.out.println(titulo);

        Print.printEspacoMeio(description.length(), 60);
        System.out.print(description);
        Print.split();
    }

    /**
     * Imprime todos os clientes cadastrados e seus informações.
     * 
     * @see appmain.Register Register.sales()
     */
    public static void costumers() {
        int contador = 1;
        Print.tituloAndDescription("Clientes Cadastrados", "Nome | Endereço | Telefone");
        for (Costumer costumer : Dados.getCostumer()) {
            System.out.printf(".%d - %s | %s | %s\n", contador, costumer.getName(), costumer.getAdress(),
                    costumer.getCelNumber());

            contador++;
        }
    }

    /**
     * Imprime todos os produtos cadastrados e seu respectivo valor e quantidade em
     * estoque.
     * 
     * @see model.Product
     */
    public static void productsInStock() {
        int contador = 1;

        Print.tituloAndDescription("Mostrar Produtos em Estoque", "Nome | Valor (R$) | Quatidade em Estoque");

        for (Product product : Dados.getProducts()) {
            System.out.printf(".%d - %s | R$ %.2f | %d un.\n", contador, product.getName(), product.getValue(),
                    product.getInStockQuant());

            contador++;
        }

    }
}
