package model;

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
}
