package control;

import main.MainFrameControl;
import vision.menu.StoreManagerMenu;

/**
 * Controller for StoreManagerMenu class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.menu.StoreManagerMenu
 */
public class StoreManagerMenuControl {
    private StoreManagerMenu view;

    /**
     * View initializer
     * 
     * @param view - StoreManagerMenu
     */
    public StoreManagerMenuControl(StoreManagerMenu view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
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
            MainFrameControl.showDeleteProduct();
        } else if (actioned == view.getButtonDeleteSeller()) {
            MainFrameControl.showDeleteSeller();
        } else if (actioned == view.getButtonDeleteCustomer()) {
            MainFrameControl.showDeleteCustomer();
        } else if (actioned == view.getButtonListProducts()) {
            MainFrameControl.showListProducts();
        } else if (actioned == view.getButtonListSellers()) {
            MainFrameControl.showListSellers();
        } else if (actioned == view.getButtonListCustomers()) {
            MainFrameControl.showListCustomers();
        } else if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }
    }

}
