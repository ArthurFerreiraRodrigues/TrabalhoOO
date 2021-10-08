package control;

import main.MainFrameControl;
import vision.listers.ListProducts;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class ListProductsControl {
    private ListProducts view;

    public ListProductsControl(ListProducts view) {
        this.view = view;
    }

    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }
    }
}
