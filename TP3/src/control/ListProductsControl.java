package control;

import main.MainFrameControl;
import vision.listers.ListProducts;

/**
 * Controller for ListProducts class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.listers.ListProducts
 */
public class ListProductsControl {
    private ListProducts view;

    /**
     * View initializer
     * 
     * @param view - ListProducts
     */
    public ListProductsControl(ListProducts view) {
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
