package control;

import model.Data;

import javax.swing.JTable;

import main.MainFrameControl;
import model.Customer;
import vision.deleters.DeleteCustomer;
import vision.table.Customers;

/**
 * Controller for DeleteCustomer class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see vision.deleters.DeleteCustomer
 * 
 */
public class DeleteCustomerControl {

    private DeleteCustomer view;

    /**
     * View initializer
     * 
     * @param view - DeleteCustomer
     */
    public DeleteCustomerControl(DeleteCustomer view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showStoreManagerMenu();
        } else if (actioned == view.getButtonDelete()) {

            String selectedName = view.getTable().getModel().getValueAt(view.getTable().getSelectedRow(), 1).toString();

            for (Customer customer : Data.getCustomers()) {
                if (customer.getName().equals(selectedName)) {
                    Data.getCustomers().remove(customer);
                    break;
                }

            }
            view.getScroll().setViewportView(new JTable(
                    Customers.genTable(Customers.toArrayList(Data.getCustomers().toArray()), view.getHeader(), false)));
            MainFrameControl.showDeleteCustomer();
        }

    }
}
