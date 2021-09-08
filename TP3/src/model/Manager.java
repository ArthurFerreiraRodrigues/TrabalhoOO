package model;

import util.Print;
import util.Read;

public class Manager {
    private String name, username, password;
    private boolean loginStatus;

    /**
     * Gera o profile do Gerente
     * 
     * @param name     : nome do Gerente
     * @param username : usuario de login
     * @param password : senha de login
     */
    public Manager(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    private String getUsername() {
        return username;
    }

    private String getPassword() {
        return password;
    }

    public boolean getLoginStatus() {
        return loginStatus;
    }

    /*----------------------------------------------------------------------*/

    private static Manager verifyLogin(String inputUser, String inputPass) {

        for (Manager manager : Data.getManagers()) {
            if (manager.getUsername().equals(inputUser)) {
                if (manager.getPassword().equals(inputPass)) {
                    return manager;
                }
            }
        }
        return null;
    }

    public void login() {
        String inputUser, inputPass;
        Manager loginModel;

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
