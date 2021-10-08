package control;

import java.awt.CardLayout;

import main.MainFrame;
import main.MainFrameControl;
import vision.listers.ListSalesById;

/**
 * Controller for ListSalesById class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.listers.ListSalesById
 */
public class ListSalesByIdControl {

    private ListSalesById view;

    /**
     * View initializer
     * 
     * @param view - ListSalesById
     */
    public ListSalesByIdControl(ListSalesById view) {
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
        } else {
            if (view.getSelector().getSelectedItem() != null) {
                view.getScroll().setViewportView(
                        view.scrollViewportView(view.getSelector().getSelectedIndex(), view.getHeader()));

                CardLayout cl = (CardLayout) MainFrame.getCont().getLayout();
                cl.show(MainFrame.getCont(), "listSalesById");
            }

        }
    }

}
