package model;

import products.Book;
import products.Miscellaneous;

/**
 * Model class of a store manager.
 * <p>
 * System administrator.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class StoreManager {
    private String name, username, password;
    private boolean loginStatus;

    /**
     * Initialize a StoreManager Object
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
        /*
         * Print.title("Alterar Dados do Gerente"); System.out.printf("Novo Nome :");
         * name = Read.Line(); System.out.printf("Novo Nome de Usuario :"); username =
         * Read.Line(); System.out.printf("Nova Senha :"); password = Read.Line();
         */
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
    public static StoreManager login() {
        String inputUser, inputPass;
        StoreManager loginModel = null;

        /*
         * do { System.out.printf("Usuario : "); inputUser = Read.Line();
         * System.out.printf("Senha : "); inputPass = Read.Line();
         * 
         * loginModel = verifyLogin(inputUser, inputPass); if (loginModel == null) {
         * System.out.printf("\nUsuario ou Senha sem correspondentes. Tente novamente."
         * ); }
         * 
         * } while (loginModel == null); loginModel.loginStatus = true;
         * 
         * System.out.printf("Login realizado com sucesso !\n");
         */

        return loginModel;
    }

    public static StoreManager isLogged() {
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
     */
    private static void addProfileToDataStoreManager(StoreManager profile) {
        Data.getStoreManagers().add(profile);
    }

    // Setters

    public static void setCoreStoreManager(String name, String username, String password) {
        addProfileToDataStoreManager(new StoreManager(name, username, password));
    }

    // Registers

    /*----------------------------------------------------------------------*/
    /**
     * Create new Product profile and adds it to an ArrayList in data.
     * 
     * @see model.Product
     * @see model.Data
     */
    public static void registerProduct() {
        int choice;

        /*
         * Print.title("Cadastro de Novo Produto");
         * 
         * System.out.printf("Quantidade de produtos a serem cadastrados : "); int
         * quantProducts = Read.Int(); for (int i = 0; i < quantProducts; i++) { do {
         * System.out.printf("Deseja cadastrar :\n\t1-Livro\t2-Outros\n"); choice =
         * Read.Int(); switch (choice) { case 1: // Book Book profileBook =
         * inputProfileBook(); addProfileToDataProduct(profileBook); break; case 2: //
         * Miscellaneous Miscellaneous profileMiscellaneous =
         * inputProfileMiscellaneous(); addProfileToDataProduct(profileMiscellaneous);
         * break; default: System.out.printf("Digite uma alternativa valida.\n"); } }
         * while (choice != 1 && choice != 2); Screen.clear();
         * System.out.printf("Registro de Produto Realizado com Sucesso.");
         * Screen.pressEnterCont();
         */
    }

    private static Book inputProfileBook() {
        /*
         * System.out.printf("\nProduto %d - Livro\n", Data.getSizeOfProducts() + 1);
         * 
         * System.out.print("\tCodigo de identificacao : "); int id = Read.Int();
         * 
         * System.out.print("\tPreco : "); double price = Read.Double();
         * 
         * System.out.print("\tAutor : "); String author = Read.Line();
         * System.out.print("\tTítulo : "); String title = Read.Line();
         * System.out.print("\tTipo : "); String type = Read.Line();
         * System.out.print("\tGênero : "); String genre = Read.Line();
         * 
         * System.out.print("\tQuantidade em Estoque : "); int inStockQuant =
         * Read.Int();
         */
        // return new Book(id, price, inStockQuant, author, title, type, genre);
        return null;
    }

    private static Miscellaneous inputProfileMiscellaneous() {
        /*
         * System.out.printf("\nProduto %d - Outros\n", Data.getSizeOfProducts() + 1);
         * 
         * System.out.print("\tCodigo de identificacao : "); int id = Read.Int();
         * 
         * System.out.print("\tPreco : "); double price = Read.Double();
         * 
         * System.out.print("\tNome : "); String name = Read.Line();
         * System.out.print("\tMarca : "); String brand = Read.Line();
         * 
         * System.out.print("\tQuantidade em Estoque : "); int inStockQuant =
         * Read.Int();
         */
        // return new Miscellaneous(id, price, inStockQuant, name, brand);
        return null;
    }

    /*----------------------------------------------------------------------*/
    /**
     * Create new Seller profile and adds it to an ArrayList in data.
     * 
     * @see model.Seller
     * @see model.Data
     */
    public static void registerSeller() {
        /*
         * Print.title("Cadastro de Novo Vendedor");
         * 
         * System.out.print("Quantidade de vendedores a serem cadastrados : "); int
         * quantCustomers = Read.Int(); for (int i = 0; i < quantCustomers; i++) {
         * Seller profile = inputProfileSeller(); addProfileToDataSeller(profile); }
         * Screen.clear();
         * System.out.printf("Registro de Vendedor Realizado com Sucesso.");
         * Screen.pressEnterCont();
         */
    }

    private static Seller inputProfileSeller() {
        /*
         * System.out.printf("\nVendedor %d\n", Data.getSizeOfSellers() + 1);
         * 
         * System.out.print("\tCodigo de identificacao : "); int id = Read.Int();
         * 
         * System.out.print("\tNome : "); String name = Read.Line();
         * 
         * double cashFlow = 0; int productsSold = 0;
         * 
         * return new Seller(id, name, cashFlow, productsSold);
         */
        return null;

    }

    // Updaters

    /*----------------------------------------------------------------------*/
    /**
     * Updates Product.
     */
    public static void updateProduct() {
        int searchId;
        Product match;

        /*
         * Print.titleAndDescription("Atualizar Produto",
         * "Tipo | Autor/Marca | Título/Nome");
         * 
         * do { Product.listAll(); System.out.printf("Buscar Produto (ID) : "); searchId
         * = Read.Int(); match = Product.searchById(searchId);
         * 
         * if (match == null) { System.out.printf("\nProduto nao encontrado!\n"); } else
         * {
         * 
         * System.out.
         * printf("\nAtualizar Dados do Produto ID : %d ?\n\t.1 - Sim\n\t.2 - Nao, voltar ao menu"
         * , match.getId()); switch (ReadMenu.choice(2)) { case 1: if (match instanceof
         * Book) { ((Book) match).updateInfo(); } else { // if (match instanceof
         * Miscellaneous) ((Miscellaneous) match).updateInfo(); } break; case 2:
         * Screen.pressEnterBack(); break; default:
         * System.out.printf("\nDigite uma opcao valida.\n"); break; }
         * 
         * } } while (match == null); Screen.clear();
         * System.out.printf("Atualizacao de Produto Realizada com Sucesso.");
         * Screen.pressEnterCont();
         */
    }

    /*----------------------------------------------------------------------*/
    /**
     * Updates Seller.
     */
    public static void updateSeller() {
        int searchId;
        Seller match;

        /*
         * Print.titleAndDescription("Alterar Dados de Vendedor", "ID | Nome");
         * 
         * Seller.list(); do { System.out.printf("Buscar Vendedor (ID) : "); searchId =
         * Read.Int(); match = Seller.searchById(searchId);
         * 
         * if (match == null) { System.out.printf("\nVendedor nao encontrado!\n"); }
         * else {
         * 
         * System.out.
         * printf("\nAlterar Dados do Vendedor ID : %d ?\n\t.1 - Sim\n\t.2 - Nao, voltar ao menu"
         * , match.getId()); switch (ReadMenu.choice(2)) { case 1: match.updateInfo();
         * break; case 2: Screen.pressEnterBack(); break; default:
         * System.out.printf("\nDigite uma opcao valida.\n"); break; } } } while (match
         * == null);
         * 
         * Screen.clear();
         * System.out.printf("Atualizacao de Vendedor Realizada com Sucesso.");
         * Screen.pressEnterCont();
         */
    }

    /*----------------------------------------------------------------------*/
    /**
     * Updates StoreManager.
     */
    public static void updateStoreManager() {
        String searchUsername;
        StoreManager match;

        /*
         * Print.title("Alterar Dados de Gerente de Loja");
         * 
         * System.out.printf("Buscar Gerente de Loja (Username) : "); searchUsername =
         * Read.Line(); match = StoreManager.searchByUsername(searchUsername); do { if
         * (match == null) { System.out.printf("\nGerente de Loja nao encontrado!\n"); }
         * else {
         * 
         * System.out.printf(
         * "\nAlterar Dados do Gerente de Loja Username : %s ?\n\t.1 - Sim\n\t.2 - Nao, voltar ao menu"
         * , match.getUsername());
         * 
         * switch (ReadMenu.choice(2)) { case 1: match.updateInfo(); break; case 2:
         * Screen.pressEnterBack(); break; default:
         * System.out.printf("\nDigite uma opcao valida.\n"); break; }
         * 
         * } } while (match == null); Screen.clear();
         * System.out.printf("Atualizacao de Gerente de Loja Realizada com Sucesso.");
         * Screen.pressEnterCont();
         */
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
    public static void deleteProduct() {
        int searchId;
        Product match;

        /*
         * Print.titleAndDescription("Deletar Dados de Produto",
         * "Tipo | Autor/Marca | Título/Nome"); Product.listAll(); do {
         * System.out.printf("Buscar Produto (ID) : "); searchId = Read.Int(); match =
         * Product.searchById(searchId);
         * 
         * if (match == null) { System.out.printf("\nProduto nao encontrado!\n"); } else
         * {
         * 
         * System.out.
         * printf("\nDeletar Dados do Produto ID : %d ?\n\t.1 - Sim\n\t.2 - Nao, voltar ao menu"
         * , match.getId()); switch (ReadMenu.choice(2)) { case 1:
         * Data.getProducts().remove(match); break; case 2: Screen.pressEnterBack();
         * break; default: System.out.printf("\nDigite uma opcao valida.\n"); break; }
         * 
         * } } while (match == null); Screen.clear();
         * System.out.printf("Delecao de Produto Realizada com Sucesso.");
         * Screen.pressEnterCont();
         */
    }

    /*----------------------------------------------------------------------*/
    /**
     * Deletes Seller.
     */
    public static void deleteSeller() {
        /*
         * int searchId; Seller match;
         * 
         * Print.titleAndDescription("Deletar Dados de Vendedor", "ID | Nome");
         * Seller.list(); do { System.out.printf("Buscar Vendedor (ID) : "); searchId =
         * Read.Int(); match = Seller.searchById(searchId);
         * 
         * if (match == null) { System.out.printf("\nVendedor nao encontrado!\n"); }
         * else {
         * 
         * System.out.
         * printf("\nDeletar Dados do Vendedor ID : %d ?\n\t.1 - Sim\n\t.2 - Nao, voltar ao menu"
         * , match.getId());
         * 
         * switch (ReadMenu.choice(2)) { case 1: Data.getSellers().remove(match); break;
         * case 2: Screen.pressEnterBack(); break; default:
         * System.out.printf("\nDigite uma opcao valida.\n"); break; }
         * 
         * } } while (match == null); Screen.clear();
         * System.out.printf("Delecao de Vendedor Realizada com Sucesso.");
         * Screen.pressEnterCont();
         */
    }

    /*----------------------------------------------------------------------*/
    /**
     * Deletes Customer.
     */
    public static void deleteCustomer() {
        String searchId;
        Customer match;

        /*
         * Print.titleAndDescription("Deletar Dados de Cliente", "Nome | Telefone");
         * Customer.list(); do { System.out.printf("Buscar Cliente (Nome Completo) : ");
         * searchId = Read.Line(); match = Customer.searchByName(searchId);
         * 
         * if (match == null) { System.out.printf("\nCliente nao encontrado!\n"); } else
         * {
         * 
         * System.out.
         * printf("\nDeletar Dados do Cliente : %s ?\n\t.1 - Sim\n\t.2 - Nao, voltar ao menu"
         * , match.getName());
         * 
         * switch (ReadMenu.choice(2)) { case 1: Data.getCustomers().remove(match);
         * break; case 2: Screen.pressEnterBack(); break; default:
         * System.out.printf("\nDigite uma opcao valida.\n"); break; }
         * 
         * } } while (match == null); Screen.clear();
         * System.out.printf("Delecao de Cliente Realizada com Sucesso.");
         * Screen.pressEnterCont();
         */
    }
}