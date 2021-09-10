package main;

import util.Fill;

public class App {
    public static void main(String[] args) throws Exception {
        Fill.customer();
        Fill.productList();
        Fill.setStoreManager(); // Nome : Gerete | Username : Gerente | Senha : Gerente
        Fill.seller();
        Fill.sale();
        main.menu.Switch.inicial();
    }
}
