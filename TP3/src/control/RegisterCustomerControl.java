package control;

import javax.swing.JOptionPane;

import main.MainFrameControl;
import model.Customer;
import model.Data;
import vision.registers.RegisterCustomer;

/**
 * Controller for RegisterCustomer class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * @see vision.registers.RegisterCustomer
 */
public class RegisterCustomerControl {
    private RegisterCustomer view;

    /**
     * View initializer
     * 
     * @param view - RegisterCustomer
     */
    public RegisterCustomerControl(RegisterCustomer view) {
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
                Data.getCustomers().add(new Customer(name, address, celNumber));
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso", "Sucesso!",
                        JOptionPane.INFORMATION_MESSAGE);

                view.getFieldName().setText("");
                view.getFieldAddress().setText("");
                view.getFieldCelNumber().setText("");

                // Funciona :D
                System.out.printf("Nome do Ultimo Cliente na Array : ");
                System.out.println(Data.getCustomers().get(Data.getCustomers().size() - 1).getName());

                MainFrameControl.showRegisterCustomer();
            }
        }

    }

}
