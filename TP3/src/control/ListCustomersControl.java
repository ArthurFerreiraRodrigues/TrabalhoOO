package control;

import main.MainFrameControl;
import vision.listers.ListCustomers;

/**
 * Controller for ListCustomers class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.listers.ListCustomers
 */
public class ListCustomersControl {
    private ListCustomers view;

    /**
     * View initializer
     * 
     * @param view - ListCustomers
     */
    public ListCustomersControl(ListCustomers view) {
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
