package model;

import products.Book;
import products.Miscellaneous;
import util.Print;
import util.Read;

public class StoreManager {
    private String name, username, password;
    private boolean loginStatus;

    /**
     * Gera o profile do Gerente
     * 
     * @param name     : Store Manager name
     * @param username : Store Manager login username
     * @param password : Store Manager login password
     */
    public StoreManager(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    /**
     * @return Store Manager name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Store Manager Username
     */
    private String getUsername() {
        return username;
    }

    /**
     * @return Store Manager password
     */
    private String getPassword() {
        return password;
    }

    public boolean getLoginStatus() {
        return loginStatus;
    }

    // Info Updater

    public void updateInfo() {
        Print.title("Alterar Dados do Gerente");
        System.out.printf("Novo Nome :");
        name = Read.Line();
        System.out.printf("Novo Nome de Usuário :");
        username = Read.Line();
        System.out.printf("Nova Senha :");
        password = Read.Line();
    }

    /*----------------------------------------------------------------------*/

    /**
     * Checks if there is a Store Manager corresponding to the input credentials.
     * 
     * @param inputUser
     * @param inputPass
     * @return Store Manager correspondent
     */
    private static StoreManager verifyLogin(String inputUser, String inputPass) {

        for (StoreManager manager : Data.getStoreManagers()) {
            if (manager.getUsername().equals(inputUser)) {
                if (manager.getPassword().equals(inputPass)) {
                    return manager;
                }
            }
        }
        return null;
    }

    /**
     * Login Process
     */
    public void login() {
        String inputUser, inputPass;
        StoreManager loginModel;

        Print.titleAndDescription("Login de Gerente", "Usuario e Senha padrao : Gerente");
        do {
            System.out.printf("Usuario : ");
            inputUser = Read.Line();
            System.out.printf("Senha : ");
            inputPass = Read.Line();

            loginModel = verifyLogin(inputUser, inputPass);
            if (loginModel == null) {
                System.out.printf("\nUsuario ou Senha sem correspondentes. Tente novamente.");
            }
            Print.split();
        } while (loginModel == null);
        loginModel.loginStatus = true;

        System.out.printf("Login realizado com sucesso !");
    }

    public StoreManager isLogged() {
        for (StoreManager manager : Data.getStoreManagers()) {
            if (manager.loginStatus == true) {
                return manager;
            }
        }
        return null;
    }

    // Adders

    /**
     * Add a model profile to an ArrayList in Data.
     * 
     * @param profile
     * @see model.Data
     */
    private static void addProfileToDataProduct(Product profile) {
        Data.getProducts().add(profile);
    }

    /**
     * Add a model profile to an ArrayList in Data.
     * 
     * @param profile
     * @see model.Data
     */
    private static void addProfileToDataSeller(Seller profile) {
        Data.getSellers().add(profile);
    }

    /**
     * Add a model profile to an ArrayList in Data.
     * 
     * @param profile
     * @see model.Data
     * 
     *      private static void addProfileToDataStoreManager(StoreManager profile) {
     *      Data.getStoreManagers().add(profile); }
     */

    // Registers

    /*----------------------------------------------------------------------*/
    /**
     * Create new Product profile and adds it to an ArrayList in data.
     * 
     * @see model.Product
     * @see model.Data
     */
    public void registerProduct() {
        int choice;

        Print.title("Cadastro de Novo Produto");

        System.out.printf("Quantidade de produtos a serem cadastrados : ");
        int quantProducts = Read.Int();
        for (int i = 0; i < quantProducts; i++) {
            do {
                System.out.printf("Deseja cadastrar :\n\t1-Livro\t2-Outros\n");
                choice = Read.Int();
                switch (choice) {
                    case 1: // Book
                        Book profileBook = inputProfileBook();
                        addProfileToDataProduct(profileBook);
                        break;
                    case 2: // Miscellaneous
                        Miscellaneous profileMiscellaneous = inputProfileMiscellaneous();
                        addProfileToDataProduct(profileMiscellaneous);
                        break;
                    default:
                        System.out.printf("Digite uma alternativa válida.\n");
                }
            } while (choice != 1 && choice != 2);
        }
    }

    private Book inputProfileBook() {
        System.out.printf("\nProduto %d - Livro\n", Data.getSizeOfProducts() + 1);

        System.out.print("\tCódigo de identificação : ");
        int id = Read.Int();

        System.out.print("\tPreço : ");
        double price = Read.Double();

        System.out.print("\tAutor : ");
        String author = Read.Line();
        System.out.print("\tTítulo : ");
        String title = Read.Line();
        System.out.print("\tTipo : ");
        String type = Read.Line();
        System.out.print("\tGênero : ");
        String genre = Read.Line();

        System.out.print("\tQuantidade em Estoque : ");
        int inStockQuant = Read.Int();

        return new Book(id, price, inStockQuant, author, title, type, genre);
    }

    private Miscellaneous inputProfileMiscellaneous() {
        System.out.printf("\nProduto %d - Outros\n", Data.getSizeOfProducts() + 1);

        System.out.print("\tCódigo de identificação : ");
        int id = Read.Int();

        System.out.print("\tPreço : ");
        double price = Read.Double();

        System.out.print("\tNome : ");
        String name = Read.Line();
        System.out.print("\tMarca : ");
        String brand = Read.Line();

        System.out.print("\tQuantidade em Estoque : ");
        int inStockQuant = Read.Int();

        return new Miscellaneous(id, price, inStockQuant, name, brand);
    }

    /*----------------------------------------------------------------------*/
    /**
     * Create new Seller profile and adds it to an ArrayList in data.
     * 
     * @see model.Seller
     * @see model.Data
     */
    public void registerSeller() {
        Print.title("Cadastro de Novo Vendedor");

        System.out.print("Quantidade de vendedores a serem cadastrados : ");
        int quantCustomers = Read.Int();
        for (int i = 0; i < quantCustomers; i++) {
            Seller profile = inputProfileSeller();
            addProfileToDataSeller(profile);
        }
    }

    private Seller inputProfileSeller() {
        System.out.printf("\nVendedor %d\n", Data.getSizeOfSellers() + 1);

        System.out.print("\tCódigo de identificação : ");
        int id = Read.Int();

        System.out.print("\tNome : ");
        String name = Read.Line();

        double cashFlow = 0;
        int productsSold = 0;

        return new Seller(id, name, cashFlow, productsSold);
    }

    // Updaters

    /*----------------------------------------------------------------------*/
    /**
     * Updates Product.
     */
    public void updateProduct() {
        int searchId;
        Product match;
        int confirmEdit;

        Print.titleAndDescription("Alterar Dados de Produto", "Tipo | Autor/Marca | Título/Nome");

        System.out.printf("Buscar Produto (ID) : ");
        searchId = Read.Int();
        match = Product.searchById(searchId);

        if (match == null) {
            System.out.printf("\nProduto não encontrado!");
        } else {

            do {
                System.out.printf("\nAlterar Dados do Produto ID : %d ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu",
                        match.getId());
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        if (match instanceof Book) {
                            ((Book) match).updateInfo();
                        } else { // if (match instanceof Miscellaneous)
                            ((Miscellaneous) match).updateInfo();
                        }
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }
    }

    /*----------------------------------------------------------------------*/
    /**
     * Updates Seller.
     */
    public void updateSeller() {
        int searchId;
        Seller match;
        int confirmEdit;

        Print.titleAndDescription("Alterar Dados de Vendedor", "ID | Nome");

        System.out.printf("Buscar Vendedor (ID) : ");
        searchId = Read.Int();
        match = Seller.searchById(searchId);

        if (match == null) {
            System.out.printf("\nVendedor não encontrado!");
        } else {

            do {
                System.out.printf("\nAlterar Dados do Vendedor ID : %d ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu",
                        match.getId());
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        match.updateInfo();
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }
    }

    /*----------------------------------------------------------------------*/
    /**
     * Updates StoreManager.
     */
    public void updateStoreManager() {
        String searchUsername;
        StoreManager match;
        int confirmEdit;

        Print.title("Alterar Dados de Gerente de Loja");

        System.out.printf("Buscar Gerente de Loja (Username) : ");
        searchUsername = Read.Line();
        match = StoreManager.searchByUsername(searchUsername);

        if (match == null) {
            System.out.printf("\nGerente de Loja não encontrado!");
        } else {

            do {
                System.out.printf(
                        "\nAlterar Dados do Gerente de Loja Username : %s ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu",
                        match.getUsername());
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        match.updateInfo();
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }
    }

    private static StoreManager searchByUsername(String searchInput) {

        for (StoreManager manager : Data.getStoreManagers()) {
            if (manager.getUsername().equals(searchInput)) {
                return manager;
            }
        }
        return null;
    }

    // Deleter

    /*----------------------------------------------------------------------*/
    /**
     * Deletes Product.
     */
    public void deleteProduct() {
        int searchId;
        Product match;
        int confirmEdit;

        Print.titleAndDescription("Deletar Dados de Produto", "Tipo | Autor/Marca | Título/Nome");

        System.out.printf("Buscar Produto (ID) : ");
        searchId = Read.Int();
        match = Product.searchById(searchId);

        if (match == null) {
            System.out.printf("\nProduto não encontrado!");
        } else {

            do {
                System.out.printf("\nDeletar Dados do Produto ID : %d ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu",
                        match.getId());
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        Data.getProducts().remove(match);
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }
    }

    /*----------------------------------------------------------------------*/
    /**
     * Deletes Seller.
     */
    public void deleteSeller() {
        int searchId;
        Seller match;
        int confirmEdit;

        Print.titleAndDescription("Deletar Dados de Vendedor", "ID | Nome");

        System.out.printf("Buscar Vendedor (ID) : ");
        searchId = Read.Int();
        match = Seller.searchById(searchId);

        if (match == null) {
            System.out.printf("\nVendedor não encontrado!");
        } else {

            do {
                System.out.printf("\nDeletar Dados do Vendedor ID : %d ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu",
                        match.getId());
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        Data.getSellers().remove(match);
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }
    }

    /*----------------------------------------------------------------------*/
    /**
     * Deletes Costumer.
     */
    public void deleteCustomer() {
        String searchId;
        Customer match;
        int confirmEdit;

        Print.titleAndDescription("Deletar Dados de Cliente", "Nome | Telefone");

        System.out.printf("Buscar Cliente (Nome Completo) : ");
        searchId = Read.Line();
        match = Customer.searchByName(searchId);

        if (match == null) {
            System.out.printf("\nCliente não encontrado!");
        } else {

            do {
                System.out.printf("\nDeletar Dados do Cliente : %s ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu",
                        match.getName());
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        Data.getCustomers().remove(match);
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }
    }
}