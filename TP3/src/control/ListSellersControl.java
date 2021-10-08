package control;

import main.MainFrameControl;
import vision.listers.ListSellers;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class ListSellersControl {
    private ListSellers view;

    public ListSellersControl(ListSellers view) {
        this.view = view;
    }

    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }

    }

}
