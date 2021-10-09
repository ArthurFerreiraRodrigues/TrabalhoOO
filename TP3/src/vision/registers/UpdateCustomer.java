package vision.registers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.UpdateCustomerControl;
import model.Data;

import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * Menu option class for SellerMenu - UpdateCustomer
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 * 
 * @see vision.menu.SellerMenu
 */
public class UpdateCustomer extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.BOLD, 16);

    private final JTextField fieldName;
    private final JTextField fieldAddress;
    private final JTextField fieldCelNumber;

    private final JButton buttonHome;
    private final JButton buttonRegister;

    private final JComboBox<Object> selector;

    private final UpdateCustomerControl controller;

    public UpdateCustomer() {
        int standartPos = 80, spacer = 50, mult = 0, x_pos = 120, x_pos_base = 260;
        controller = new UpdateCustomerControl(this);

        setBounds(100, 100, 830, 522);
        setLayout(null);

        JLabel labelTitle = new JLabel("Registrar Cliente");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(220, 5, 800, 800);
        add(labelTitle);

        selector = new JComboBox<>(Data.getCustomersInfo(Data.getCustomers()));
        selector.setBackground(Color.LIGHT_GRAY);
        selector.setForeground(Color.BLACK);
        selector.setFont(FONT);
        selector.setBounds(540, standartPos + spacer * 0, 120, 31);
        add(selector);

        fieldName = new JTextField();
        JLabel labelName = new JLabel("Novo Nome :");
        labelName.setFont(FONT);
        labelName.setForeground(Color.WHITE);
        labelName.setHorizontalAlignment(SwingConstants.CENTER);
        labelName.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelName.setLabelFor(fieldName);
        add(labelName);
        fieldName.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldName);
        mult++;

        fieldAddress = new JTextField();
        JLabel labelAddress = new JLabel("Novo Endereco :");
        labelAddress.setFont(FONT);
        labelAddress.setForeground(Color.WHITE);
        labelAddress.setHorizontalAlignment(SwingConstants.CENTER);
        labelAddress.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelAddress.setLabelFor(fieldAddress);
        add(labelAddress);
        fieldAddress.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldAddress);
        mult++;

        fieldCelNumber = new JTextField();
        JLabel labelCelNumber = new JLabel("Novo Telefone :");
        labelCelNumber.setFont(FONT);
        labelCelNumber.setForeground(Color.WHITE);
        labelCelNumber.setHorizontalAlignment(SwingConstants.CENTER);
        labelCelNumber.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelCelNumber.setLabelFor(fieldCelNumber);
        add(labelCelNumber);
        fieldCelNumber.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldCelNumber);
        mult++;

        buttonRegister = new JButton("Cadastrar");
        buttonRegister.setBackground(Color.LIGHT_GRAY);
        buttonRegister.setForeground(Color.BLACK);
        buttonRegister.setFont(FONT);
        buttonRegister.setBounds(x_pos_base, standartPos + spacer * mult, 120, 31);
        buttonRegister.addActionListener(this);
        add(buttonRegister);

        buttonHome = new JButton("Cancelar");
        buttonHome.setBackground(Color.LIGHT_GRAY);
        buttonHome.setForeground(Color.BLACK);
        buttonHome.setFont(FONT);
        buttonHome.setBounds(x_pos_base + 130, standartPos + spacer * mult, 120, 31);
        buttonHome.addActionListener(this);
        add(buttonHome);

        JLabel labelBackground = new JLabel("");
        labelBackground.setBounds(0, 0, 830, 522);
        labelBackground.setIcon(new ImageIcon(RegisterCustomer.class.getResource("/vision/images/libraryBack.png")));
        add(labelBackground);

    }

    /**
     * Executes the actioned button actions
     * 
     * @param actioned - Object
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        controller.execute(e.getSource());

    }

    public JButton getButtonHome() {
        return buttonHome;
    }

    public JButton getButtonRegister() {
        return buttonRegister;
    }

    public UpdateCustomerControl getController() {
        return controller;
    }

    public JTextField getFieldName() {
        return fieldName;
    }

    public JTextField getFieldAddress() {
        return fieldAddress;
    }

    public JTextField getFieldCelNumber() {
        return fieldCelNumber;
    }

    public JComboBox<Object> getSelector() {
        return selector;
    }

}
