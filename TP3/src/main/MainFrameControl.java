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

    public MainFrameControl(MainFrame view) {
        this.view = view;
    }

    public void screenRefresh(Object screen) {

        if (screen == view.getInicialMenu()) {
            InicialMenu screenDisplaying = (InicialMenu) screen;
        } else if (screen == view.getStoreManagerMenu()) {
            StoreManagerMenu screenDisplaying = (StoreManagerMenu) screen;
        } else if (screen == view.getListSalesById()) {
            ListSalesById screenDisplaying = (ListSalesById) screen;
        }
    }

    public static void showInicialMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "inicialMenu");
    }

    public static void showStoreManagerMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "storeManagerMenu");
    }

    public static void showSellerMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "sellerMenu");
    }

    public static void showListSalesMenu() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSalesMenu");
    }

    public static void showListAllSales() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listAllSales");
    }

    public static void showListSalesMenuById() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSalesById");
    }

    public static void showListSalesMenuByName() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSalesByName");
    }

    public static void showDeleteCustomer() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "deleteCustomer");
    }

    public static void showDeleteSeller() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "deleteSeller");
    }

    public static void showDeleteProduct() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "deleteProduct");
    }

    public static void showListSellers() {

        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listSellers");
    }

    public static void showListProducts() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listProducts");
    }

    public static void showListCustomers() {
        CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
        cl.show(MainFrame.getCont(), "listCustomers");
    }
}
