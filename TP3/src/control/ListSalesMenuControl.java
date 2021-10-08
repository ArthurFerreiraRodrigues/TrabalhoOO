package control;

import main.MainFrameControl;
import vision.menu.ListSalesMenu;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class ListSalesMenuControl {
    private ListSalesMenu view;

    public ListSalesMenuControl(ListSalesMenu view) {
        this.view = view;
    }

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
