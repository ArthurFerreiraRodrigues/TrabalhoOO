package control;

import main.MainFrameControl;
import vision.menu.SellerMenu;

/**
 * Controller for SellerMenu class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.menu.SellerMenu
 */
public class SellerMenuControl {

    private SellerMenu view;

    /**
     * View initializer
     * 
     * @param view - SellerMenu
     */
    public SellerMenuControl(SellerMenu view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {

        if (actioned == view.getButtonRegisterSale()) {
            // MainFrameControl.showListAllSales();
        } else if (actioned == view.getButtonRegisterCustomer()) {
            MainFrameControl.showRegisterCustomer();
        } else if (actioned == view.getButtonUpdateCustomer()) {
            MainFrameControl.showUpdateCustomer();
        } else if (actioned == view.getButtonListCustomers()) {
            MainFrameControl.showListCustomers();
        } else if (actioned == view.getButtonListProducts()) {
            MainFrameControl.showListProducts();
        } else if (actioned == view.getButtonListSellers()) {
            MainFrameControl.showListSellers();
        } else if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }

    }

}
