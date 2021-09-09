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
     */
    private static void addProfileToDataStoreManager(StoreManager profile) {
        Data.getStoreManagers().add(profile);
    }

    // Registers

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

    public Book inputProfileBook() {
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

    public Miscellaneous inputProfileMiscellaneous() {
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
}
