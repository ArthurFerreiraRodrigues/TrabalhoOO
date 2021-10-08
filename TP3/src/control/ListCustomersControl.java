package control;

import main.MainFrameControl;
import vision.listers.ListCustomers;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class ListCustomersControl {
    private ListCustomers view;

    public ListCustomersControl(ListCustomers view) {
        this.view = view;
    }

    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showInicialMenu();
        }

    }

}
