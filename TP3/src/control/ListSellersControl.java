package control;

import main.MainFrameControl;
import vision.listers.ListSellers;

/**
 * Controller for ListSellers class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.listers.ListSellers
 */
public class ListSellersControl {
    private ListSellers view;

    /**
     * View initializer
     * 
     * @param view - ListSellers
     */
    public ListSellersControl(ListSellers view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }

    }

}
