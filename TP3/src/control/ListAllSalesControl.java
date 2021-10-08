package control;

import main.MainFrameControl;
import vision.listers.ListAllSales;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class ListAllSalesControl {
    private ListAllSales view;

    public ListAllSalesControl(ListAllSales view) {
        this.view = view;
    }

    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showListSalesMenu();
        }

    }

}
