package control;

import javax.swing.JTable;

import main.MainFrameControl;
import model.Data;
import model.Product;
import vision.deleters.DeleteProduct;
import vision.table.Products;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class DeleteProductControl {
    private DeleteProduct view;

    public DeleteProductControl(DeleteProduct view) {
        this.view = view;
    }

    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showStoreManagerMenu();
        } else if (actioned == view.getButtonDelete()) {

            String selectedId = view.getTable().getModel().getValueAt(view.getTable().getSelectedRow(), 1).toString();

            for (Product product : Data.getProducts()) {
                if (Integer.toString(product.getId()).equals(selectedId)) {
                    Data.getProducts().remove(product);
                    break;
                }
            }
            view.getScroll().setViewportView(new JTable(
                    Products.genTable(Products.toArrayList(Data.getProducts().toArray()), view.getHeader(), false)));
            MainFrameControl.showDeleteProduct();
        }

    }
}
