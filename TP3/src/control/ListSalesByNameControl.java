package control;

import java.awt.CardLayout;

import main.MainFrame;
import main.MainFrameControl;
import vision.listers.ListSalesByName;

/**
 * Controller for ListSalesByName class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.listers.ListSalesByName
 */
public class ListSalesByNameControl {
    private ListSalesByName view;

    /**
     * View initializer
     * 
     * @param view - ListSalesByName
     */
    public ListSalesByNameControl(ListSalesByName view) {
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
                cl.show(MainFrame.getCont(), "listSalesByName");
            }
        }

    }

}
