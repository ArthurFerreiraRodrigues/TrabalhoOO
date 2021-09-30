package control;

import main.MainFrameControl;
import vision.menu.InicialMenu;

public class InicialMenuControl {
    private InicialMenu view;

    public InicialMenuControl(InicialMenu view) {
        this.view = view;
        // helper = new MenuControlHelper(view);
    }

    public void execute(Object actioned) {
        if (actioned == view.getButtonSpaceStoreManager()) {
            MainFrameControl.showStoreManagerMenu();

        } else if (actioned == view.getButtonSpaceSeller()) {
            MainFrameControl.showSellerMenu();

        } else if (actioned == view.getButtonListSales()) {
            MainFrameControl.showListSalesMenu();

        } else if (actioned == view.getButtonListProducts()) {
            // MainFrameControl.mostrarRelatorioAtoresDiretores();

        } else if (actioned == view.getButtonListSellers()) {
            // MainFrameControl.mostrarRelatorioCache();

        } else if (actioned == view.getButtonListCustomers()) {
            // MainFrameControl.mostrarRelatorioPersonagens();
        }
    }
}
