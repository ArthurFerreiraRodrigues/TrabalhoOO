package control;

import java.awt.CardLayout;

import main.MainFrame;
import main.MainFrameControl;
import vision.listers.ListSalesById;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class ListSalesByIdControl {

    private ListSalesById view;

    public ListSalesByIdControl(ListSalesById view) {
        this.view = view;
    }

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
