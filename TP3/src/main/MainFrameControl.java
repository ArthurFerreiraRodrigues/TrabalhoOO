package main;

import java.awt.CardLayout;

import vision.listers.ListSalesById;
import vision.menu.InicialMenu;
import vision.menu.StoreManagerMenu;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class MainFrameControl {
    private MainFrame view;

    /**
     * View initializer
     * 
     * @param view - MainFrame
     */
    public MainFrameControl(MainFrame view) {
        this.view = view;
    }

    /**
     * Refreshes the screen
     * 
     * @param screen - Object
     */
    public void screenRefresh(Object screen) {

        if (screen == view.getInicialMenu()) {
            InicialMenu screenDisplaying = (InicialMenu) screen;
        } else if (screen == view.getStoreManagerMenu()) {
            StoreManagerMenu screenDisplaying = (StoreManagerMenu) screen;
        } else if (screen == view.getListSalesById()) {
            ListSalesById screenDisplaying = (ListSalesById) screen;
        }
    }

    /**
     * Change the CardLayout screen to inicialMenu
     */
    public static void showInicialMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "inicialMenu");
    }

    /**
     * Change the CardLayout screen to storeManagerMenu
     */
    public static void showStoreManagerMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "storeManagerMenu");
    }

    /**
     * Change the CardLayout screen to sellerMenu
     */
    public static void showSellerMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "sellerMenu");
    }

    /**
     * Change the CardLayout screen to listSalesMenu
     */
    public static void showListSalesMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSalesMenu");
    }

    /**
     * Change the CardLayout screen to listAllSales
     */
    public static void showListAllSales() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listAllSales");
    }

    /**
     * Change the CardLayout screen to listSalesById
     */
    public static void showListSalesMenuById() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSalesById");
    }

    /**
     * Change the CardLayout screen to listSalesByName
     */
    public static void showListSalesMenuByName() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSalesByName");
    }

    /**
     * Change the CardLayout screen to deleteCustomer
     */
    public static void showDeleteCustomer() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "deleteCustomer");
    }

    /**
     * Change the CardLayout screen to deleteSeller
     */
    public static void showDeleteSeller() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "deleteSeller");
    }

    /**
     * Change the CardLayout screen to deleteProduct
     */
    public static void showDeleteProduct() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "deleteProduct");
    }

    /**
     * Change the CardLayout screen to listSellers
     */
    public static void showListSellers() {

        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSellers");
    }

    /**
     * Change the CardLayout screen to listProducts
     */
    public static void showListProducts() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listProducts");
    }

    /**
     * Change the CardLayout screen to listCustomers
     */
    public static void showListCustomers() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listCustomers");
    }
}
