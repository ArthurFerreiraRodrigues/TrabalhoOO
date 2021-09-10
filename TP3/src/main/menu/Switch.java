package main.menu;

import util.Read;
import util.Screen;
import util.ReadMenu;

import java.util.ArrayList;

import model.Customer;
import model.Data;
import model.Product;
import model.Sale;
import model.Seller;
import model.StoreManager;
import products.Book;
import products.Miscellaneous;
import util.Print;

public class Switch {

    public static void inicial() {
        int choice;

        do {
            Screen.clear();
            main.menu.Print.inicial();
            choice = ReadMenu.choice(9);
            Screen.clear();
            switch (choice) {
                case 1:
                    Switch.case1();
                    break;
                case 2:
                    Switch.case2();
                    break;
                case 3:
                    Switch.case3();
                    break;
                case 4:
                    Product.listAll();
                    Screen.pressEnterBack();
                    break;
                case 5:
                    Customer.list();
                    Screen.pressEnterBack();
                    break;
                case 6:
                    Seller.list();
                    Screen.pressEnterBack();
                    break;
                case 7:
                    Switch.case7();
                    break;
                case 8:
                    Switch.case8();
                    break;
                case 9:
                    Switch.case9();
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }

    private static void case1() {
        int choice;
        StoreManager manager = StoreManager.isLogged();
        Screen.clear();
        Print.title("Área do Gerente de Loja");
        if (manager == null) {
            System.out.printf("Login não efetivado. Deseja fazer um login ?\n\t\t1.Sim 2.Não\n\t\t     ");
            do {
                choice = Read.Int();

                switch (choice) {
                    case 1:
                        Screen.clear();
                        manager = StoreManager.login();

                        break;
                    case 2:
                        Print.split();
                        Screen.pressEnterBack();
                        break;

                    default:
                        System.out.printf("\nDigite 1 para Sim e 2 para Não.\n");
                        break;
                }
            } while (choice != 1 && choice != 2);
        } else {
            Screen.clear();
            do {
                main.menu.Print.storeManagerActions();
                choice = ReadMenu.choice(11);
                switch (choice) {
                    case 1:
                        StoreManager.registerProduct();
                        break;
                    case 2:
                        StoreManager.registerSeller();
                        break;
                    case 3:
                        StoreManager.updateProduct();
                        break;
                    case 4:
                        StoreManager.updateSeller();
                        break;
                    case 5:
                        StoreManager.updateStoreManager();
                        break;
                    case 6:
                        StoreManager.deleteProduct();
                        break;
                    case 7:
                        StoreManager.deleteSeller();
                        break;
                    case 8:
                        StoreManager.deleteCustomer();
                        break;
                    case 9:
                        Seller.list();
                        break;
                    case 10:
                        Product.listAll();
                        break;
                    case 11:
                        Customer.list();
                        break;
                    case 0:
                        Switch.inicial();
                        break;
                }
            } while (choice != 0);

        }
    }

    private static void case2() {
        Seller selected;
        int pos;

        Print.title("Área do Vendedor");
        Seller.list();
        do {
            System.out.printf("Selecione o Vendedor (Posição na lista) : ");
            pos = Read.Int() - 1;
            if (pos > Data.getSizeOfSellers() || pos < 0) {
                System.out.println("\nDigite uma Posição Válida.\n");
            }
        } while (pos > Data.getSizeOfSellers() || pos < 0);
        selected = Data.getSellers().get(pos);

        Screen.clear();
        main.menu.Print.sellerActions(selected);
        switch (ReadMenu.choice(4)) {
            case 1:
                selected.registerSale();
                break;
            case 2:
                selected.registerCustomer();
                break;
            case 3:
                selected.updateCustomer();
                break;
            case 4:
                Customer.list();
                break;
            case 0:
                Switch.inicial();
                break;
        }

    }

    private static void case3() {
        int choice;

        do {
            main.menu.Print.listSalesOptions();
            choice = ReadMenu.choice(3);
            Screen.clear();
            switch (choice) {
                case 1:
                    Sale.list();
                    break;
                case 2:

                    Seller.listSalesMadeById();
                    break;

                case 3:
                    Seller.listSalesMadeByName();
                    break;
                case 0:
                    Switch.inicial();
                    break;
            }
        } while (choice != 0);
    }

    private static void case7() {
        int choice, searchId;
        String searchAuthor, searchTitle, searchName, searchBrand;

        do {
            Screen.clear();
            Print.title("Buscar Produtos");
            System.out.printf(".1 - Buscar Produto por ID     \n");
            System.out.printf(".2 - Buscar Livro por Autor    \n");
            System.out.printf(".3 - Buscar Livro por Título   \n");
            System.out.printf(".4 - Buscar Variados por Nome  \n");
            System.out.printf(".5 - Buscar Variados por Marca \n");
            System.out.printf(".0 - Voltar ao Menu Inicial");

            choice = ReadMenu.choice(5);
            Screen.clear();
            int i = 1;
            switch (choice) {
                case 1:
                    Print.title("Buscar Produto por ID");
                    Product.listAll();
                    System.out.printf("Digite a ID do Produto : ");
                    searchId = Read.Int();
                    Product match = Product.searchById(searchId);

                    Screen.clear();
                    Print.titleAndDescription("Resultado da Busca por ID",
                            "ID | Tipo | Preço | Estoque | Autor/Marca | Título/Nome");
                    if (match instanceof Book) {
                        System.out.printf(((Book) match).toString() + "\n");
                    } else {
                        System.out.printf(((Miscellaneous) match).toString() + "\n");
                    }
                    Print.split();
                    Screen.pressEnterBack();
                    break;
                case 2:
                    ArrayList<Book> listAuthor = new ArrayList<>();
                    Print.title("Buscar Livro por Autor");
                    Book.list();
                    do {
                        System.out.printf("Digite o Nome do Autor : ");
                        searchAuthor = Read.Line();
                        listAuthor = Book.searchByAuthor(searchAuthor);
                        if (listAuthor == null) {
                            System.out.printf("\nNenhum Livro do Autor '%s'.\n", searchAuthor);
                        }
                    } while (listAuthor == null);

                    Screen.clear();
                    Print.titleAndDescription("Resultado da Busca por Autor",
                            "ID | Tipo | Preço | Estoque | Autor | Título");
                    for (Book book : listAuthor) {
                        System.out.printf("%d. " + book.toString(), i);
                        i++;
                    }
                    Print.split();
                    Screen.pressEnterBack();
                    break;
                case 3:
                    ArrayList<Book> listTitle = new ArrayList<>();
                    Print.title("Buscar Livro por Título");
                    Book.list();
                    do {
                        System.out.printf("Digite o Título do Livro : ");
                        searchTitle = Read.Line();
                        listTitle = Book.searchByTitle(searchTitle);
                        if (listTitle == null) {
                            System.out.printf("\nNenhum Livro com Título '%s'.\n", searchTitle);
                        }
                    } while (listTitle == null);

                    Screen.clear();
                    Print.titleAndDescription("Resultado da Busca por Título",
                            "ID | Tipo | Preço | Estoque | Autor | Título");
                    for (Book book : listTitle) {
                        System.out.printf("%d. " + book.toString(), i);
                        i++;
                    }
                    Print.split();
                    Screen.pressEnterBack();
                    break;
                case 4:
                    ArrayList<Miscellaneous> listName = new ArrayList<>();
                    Print.title("Buscar Produto Variado por Nome");
                    Miscellaneous.list();
                    do {
                        System.out.printf("Digite o Nome do Produto : ");
                        searchName = Read.Line();
                        listName = Miscellaneous.searchByName(searchName);
                        if (listName == null) {
                            System.out.printf("\nNenhum Produto Variado com Nome '%s'.\n", searchName);
                        }
                    } while (listName == null);

                    Screen.clear();
                    Print.titleAndDescription("Resultado da Busca por Nome",
                            "ID | Tipo | Preço | Estoque | Marca | Nome");
                    for (Miscellaneous miscellaneous : listName) {
                        System.out.printf("%d. " + miscellaneous.toString(), i);
                        i++;
                    }
                    Print.split();
                    Screen.pressEnterBack();
                    break;
                case 5:
                    ArrayList<Miscellaneous> listBrand = new ArrayList<>();
                    int quit = 0;
                    Print.title("Buscar Produto Variado por Marca");
                    Miscellaneous.list();
                    do {
                        System.out.printf("*Digite 'sair' para sair.");
                        System.out.printf("Digite a Marca do Produto : ");

                        searchBrand = Read.Line();
                        if (searchBrand.equalsIgnoreCase("sair")) {
                            quit = 1;

                        } else {
                            listBrand = Miscellaneous.searchByBrand(searchBrand);

                            if (listBrand == null) {
                                System.out.printf("\nNenhum Produto Variado com Marca '%s'.\n", searchBrand);
                            }
                        }
                    } while (listBrand == null && !searchBrand.equalsIgnoreCase("sair"));

                    if (quit == 0) {
                        Screen.clear();
                        Print.titleAndDescription("Resultado da Busca por Nome",
                                "ID | Tipo | Preço | Estoque | Marca | Nome");
                        for (Miscellaneous miscellaneous : listBrand) {
                            System.out.printf("%d. " + miscellaneous.toString(), i);
                            i++;
                        }
                    }
                    Print.split();
                    Screen.pressEnterBack();
                    break;
                case 0:
                    Switch.inicial();
                    break;
            }
        } while (choice != 0);
    }

    private static void case8() {
        String searchName;
        Print.title("Buscar Clientes");
        Customer.list();
        System.out.printf("Digite o Nome do Cliente : ");
        searchName = Read.Line();
        Customer customer = Customer.searchByName(searchName);

        Screen.clear();
        Print.titleAndDescription("Resultado da Busca de Cliente", "Nome | Endereço | Telefone | Qtd.Visitas");
        System.out.printf("%s | %s | %s | %d", customer.getName(), customer.getAdress(), customer.getCelNumber(),
                customer.getTimesInStore());
        Print.split();
        Screen.pressEnterBack();
    }

    private static void case9() {
        int choice, searchId;
        String searchName;
        Seller match;
        do {
            Screen.clear();
            Print.title("Buscar Vendedores");
            System.out.printf(".1 - Buscar Vendedor por ID      \n");
            System.out.printf(".2 - Buscar Vendedor por Nome    \n");
            System.out.printf(".0 - Voltar ao Menu Inicial      \n");

            choice = ReadMenu.choice(2);
            Screen.clear();
            switch (choice) {
                case 1:
                    Print.title("Buscar Vendedor por ID");
                    Seller.list();
                    do {
                        System.out.printf("Digite o ID do Vendedor : ");
                        searchId = Read.Int();
                        match = Seller.searchById(searchId);
                        if (match == null) {
                            System.out.printf("\nDigite uma ID válida.\n");
                        }
                    } while (match == null);
                    Screen.clear();
                    Print.titleAndDescription("Resultado da Busca de Vendedor por ID",
                            "ID Vendedor | Nome Vendedor | Fluxo de Caixa | Qtd.Unidades");
                    System.out.printf("%d | %s | %.2f | %d ", match.getId(), match.getName(), match.getCashFlow(),
                            match.getUnitsSold());

                    Print.split();
                    Screen.pressEnterBack();
                    break;

                case 2:
                    ArrayList<Seller> list = new ArrayList<>();
                    int i = 1;
                    Print.title("Buscar Vendedor por Nome");
                    Seller.list();
                    do {
                        System.out.printf("Digite o Nome do Vendedor : ");
                        searchName = Read.Line();
                        list = Seller.searchByName(searchName);
                        if (list == null) {
                            System.out.printf("\nDigite um Nome válido.\n");
                        }
                    } while (list == null);
                    Screen.clear();
                    Print.titleAndDescription("Resultado da Busca de Vendedor por Nome",
                            "ID Vendedor | Nome Vendedor | Fluxo de Caixa | Qtd.Unidades");
                    for (Seller seller : list) {
                        System.out.printf("%d. %d | %s | %.2f | %d ", i, seller.getId(), seller.getName(),
                                seller.getCashFlow(), seller.getUnitsSold());
                        i++;
                    }

                    Print.split();
                    Screen.pressEnterBack();
                    break;
            }
        } while (choice != 0);
    }

}
