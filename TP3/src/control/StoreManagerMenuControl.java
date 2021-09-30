package control;

import main.MainFrameControl;
import vision.menu.StoreManagerMenu;

public class StoreManagerMenuControl {
    private StoreManagerMenu view;

    public StoreManagerMenuControl(StoreManagerMenu view) {
        this.view = view;
    }

    public void execute(Object actioned) {
        if (actioned == view.getButtonLogin()) {
            // MainFrameControl.showListAllSales();
        } else if (actioned == view.getButtonRegisterProduct()) {
            // MainFrameControl.showListSalesMenuById();
        } else if (actioned == view.getButtonRegisterSeller()) {
            // MainFrameControl.showListSalesMenuByName();
        } else if (actioned == view.getButtonUpdateProduct()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonUpdateSeller()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonUpdateStoreManager()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonDeleteProduct()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonDeleteSeller()) {
            // MainFrameControl.showInicialMenu();
        } else if (actioned == view.getButtonDeleteCustomer()) {
            // MainFrameControl.showInicialMenu();
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
