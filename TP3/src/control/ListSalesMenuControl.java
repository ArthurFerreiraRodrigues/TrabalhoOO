package control;

import main.MainFrameControl;
import vision.menu.ListSalesMenu;

/**
 * Controller for ListSalesMenu class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see vision.menu.ListSalesMenu
 */
public class ListSalesMenuControl {
    private ListSalesMenu view;

    /**
     * View initializer
     * 
     * @param view - ListSalesMenu
     */
    public ListSalesMenuControl(ListSalesMenu view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {
        if (actioned == view.getButtonListAll()) {
            MainFrameControl.showListAllSales();
        } else if (actioned == view.getButtonListSalesById()) {
            MainFrameControl.showListSalesMenuById();
        } else if (actioned == view.getButtonListSalesByName()) {
            MainFrameControl.showListSalesMenuByName();
        } else if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }
    }

}
