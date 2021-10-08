package control;

import main.MainFrameControl;
import vision.listers.ListAllSales;

/**
 * Controller for ListAllSales class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.listers.ListAllSales
 */
public class ListAllSalesControl {
    private ListAllSales view;

    /**
     * View initializer
     * 
     * @param view - ListAllSales
     */
    public ListAllSalesControl(ListAllSales view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showListSalesMenu();
        }

    }

}
