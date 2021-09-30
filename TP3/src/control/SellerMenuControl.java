package control;

import main.MainFrameControl;
import vision.menu.SellerMenu;

public class SellerMenuControl {

    private SellerMenu view;

    public SellerMenuControl(SellerMenu view) {
        this.view = view;
    }

    public void execute(Object actioned) {

        if (actioned == view.getButtonRegisterSale()) {
            MainFrameControl.showListAllSales();
        } else if (actioned == view.getButtonRegisterCustomer()) {
            MainFrameControl.showListSalesMenuById();
        } else if (actioned == view.getButtonUpdaterCustomer()) {
            MainFrameControl.showListSalesMenuByName();
        } else if (actioned == view.getButtonListProducts()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonListSellers()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonListCustomers()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }

    }

}
