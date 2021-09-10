package main.menu;

import model.Seller;

public class Print {

    public void inicial() {
        util.Print.title("Menu Inicial");

        System.out.printf(".1  - Área do Gerente de Loja   \n");
        System.out.printf(".2  - Área do Vendedor          \n");
        System.out.printf(".3  - Listar Vendas Realiazadas \n");
        System.out.printf(".4  - Listar Produtos           \n");
        System.out.printf(".5  - Listar Clientes           \n");
        System.out.printf(".6  - Listar Vendedores         \n");
        System.out.printf(".7  - Buscar Produtos           \n");
        System.out.printf(".8  - Buscar Clientes           \n");
        System.out.printf(".9  - Buscar Vendedores         \n");
        System.out.printf(".0  - Sair                      \n");

        util.Print.split();
    }

    /**
     * Option 1 from Incial Menu
     */
    public void storeManagerActions() {
        util.Print.title("Área do Gerente de Loja");

        System.out.printf(".1  - Registrar Produto         \n");
        System.out.printf(".2  - Registrar Vendedor        \n");
        System.out.printf(".3  - Atualizar Produto         \n");
        System.out.printf(".4  - Atualizar Vendedor        \n");
        System.out.printf(".5  - Atualizar Gerente         \n");
        System.out.printf(".6  - Deletar Produto           \n");
        System.out.printf(".7  - Deletar Vendedor          \n");
        System.out.printf(".8  - Deletar Cliente           \n");
        System.out.printf(".9  - Listar Vendedores         \n");
        System.out.printf(".10 - Listar Produtos           \n");
        System.out.printf(".11 - Listar Clientes           \n");
        System.out.printf(".0  - Voltar ao Menu Inicial    \n");

        util.Print.split();
    }

    /**
     * Option 2 from Incial Menu
     */
    public void sellerActions(Seller selected) {
        util.Print.title("Área do Vendedor");
        System.out.printf("Vendedor Selecionado\n");
        System.out.printf("ID : %d | Nome : %s\n\n", selected.getId(), selected.getName());

        System.out.printf("\t.1 - Registrar Venda        \n");
        System.out.printf("\t.2 - Registrar Cliente      \n");
        System.out.printf("\t.3 - Atualizar Cliente      \n");
        System.out.printf("\t.4 - Listar Clientes        \n");
        System.out.printf("\t.0 - Voltar ao Menu Inicial \n");

        util.Print.split();
    }

    /**
     * Option 3 from Incial Menu
     */
    public void listSalesOptions() {
        util.Print.title("Listar Vendas Realiazadas");

        System.out.printf(".1 - Listar Todas as Vendas                    \n");
        System.out.printf(".2 - Listar Vendas Feitas por Vendedor (ID)    \n");
        System.out.printf(".3 - Listar Vendas Feitas por vendedor (Nome)  \n");
        System.out.printf(".0 - Voltar ao Menu Inicial                    \n");

        util.Print.split();
    }
}
