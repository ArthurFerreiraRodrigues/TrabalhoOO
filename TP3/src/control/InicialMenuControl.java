package control;

import main.MainFrameControl;
import vision.menu.InicialMenu;

/**
 * Controller for InicialMenu class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see vision.menu.InicialMenu
 */
public class InicialMenuControl {
    private InicialMenu view;

    /**
     * View initializer
     * 
     * @param view - InicialMenu
     */
    public InicialMenuControl(InicialMenu view) {
        this.view = view;
        // helper = new MenuControlHelper(view);
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {
        if (actioned == view.getButtonSpaceStoreManager()) {
            MainFrameControl.showStoreManagerMenu();

        } else if (actioned == view.getButtonSpaceSeller()) {
            MainFrameControl.showSellerMenu();

        } else if (actioned == view.getButtonListSales()) {
            MainFrameControl.showListSalesMenu();

        } else if (actioned == view.getButtonListProducts()) {
            MainFrameControl.showListProducts();

        } else if (actioned == view.getButtonListSellers()) {
            MainFrameControl.showListSellers();

        } else if (actioned == view.getButtonListCustomers()) {
            MainFrameControl.showListCustomers();
        }
    }
}
