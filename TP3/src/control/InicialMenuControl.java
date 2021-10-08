package control;

import main.MainFrameControl;
import vision.menu.InicialMenu;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class InicialMenuControl {
    private InicialMenu view;

    /**
     * Constructor for InicialMenuControl
     */
    public InicialMenuControl(InicialMenu view) {
        this.view = view;
        // helper = new MenuControlHelper(view);
    }

    /**
     * Receives user input button and shows the selected screen
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
