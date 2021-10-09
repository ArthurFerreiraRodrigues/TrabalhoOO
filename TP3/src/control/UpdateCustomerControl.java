package control;

import javax.swing.JOptionPane;

import main.MainFrameControl;
import model.Data;
import vision.registers.UpdateCustomer;

/**
 * Controller for UpdateCustomer class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.menu.UpdateCustomer
 */
public class UpdateCustomerControl {
    private UpdateCustomer view;

    /**
     * View initializer
     * 
     * @param view - RegisterCustomerview
     */
    public UpdateCustomerControl(UpdateCustomer view) {
        this.view = view;
    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    public void execute(Object actioned) {
        if (actioned == view.getButtonHome()) {
            MainFrameControl.showSellerMenu();
        } else if (actioned == view.getButtonRegister()) {
            String name = view.getFieldName().getText();
            String address = view.getFieldAddress().getText();
            String celNumber = view.getFieldCelNumber().getText();

            if (name.equals("") || address.equals("") || celNumber.equals("")) {

                JOptionPane.showMessageDialog(null, "Nenhum Campo Pode Estar Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);

            } else {
                Data.getCustomers().get(view.getSelector().getSelectedIndex()).updateCustomerInfo(name, address,
                        celNumber);
                JOptionPane.showMessageDialog(null, "Alteracao de Cadastro Efetuada com Sucesso", "Sucesso!",
                        JOptionPane.INFORMATION_MESSAGE);

                view.getFieldName().setText("");
                view.getFieldAddress().setText("");
                view.getFieldCelNumber().setText("");

                // Funciona :D
                System.out.printf("Nome do Cliente Selecionado na ComboBox : ");
                System.out.println(Data.getCustomers().get(view.getSelector().getSelectedIndex()).getName());

                MainFrameControl.showUpdateCustomer();
            }
        }

    }

}
