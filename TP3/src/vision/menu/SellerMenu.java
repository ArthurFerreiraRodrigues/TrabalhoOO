package vision.menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.SellerMenuControl;

import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * Class with all seller menu options.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 */
public class SellerMenu extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private final JButton buttonRegisterSale;
    private final JButton buttonRegisterCustomer;
    private final JButton buttonUpdateCustomer;

    private final JButton buttonListProducts;
    private final JButton buttonListSellers;
    private final JButton buttonListCustomers;

    private final JButton buttonHome;

    private final SellerMenuControl controller;

    /**
     * Adds all menu options for Seller and a home button.
     */
    public SellerMenu() {
        int standartPos = 80, spacer = 50, mult = 0, x_pos = 280;
        controller = new SellerMenuControl(this);

        setBounds(100, 100, 830, 522);
        setLayout(null);

        JLabel labelTitle = new JLabel("Area do Vendedor");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(230, 5, 800, 800);
        add(labelTitle);

        buttonRegisterSale = new JButton("Registrar Venda");
        buttonRegisterSale.setBackground(Color.LIGHT_GRAY);
        buttonRegisterSale.setForeground(Color.BLACK);
        buttonRegisterSale.setFont(FONT);
        buttonRegisterSale.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
        buttonRegisterSale.addActionListener(this);
        add(buttonRegisterSale);
        mult++;

        buttonRegisterCustomer = new JButton("Registrar Cliente");
        buttonRegisterCustomer.setBackground(Color.LIGHT_GRAY);
        buttonRegisterCustomer.setForeground(Color.BLACK);
        buttonRegisterCustomer.setFont(FONT);
        buttonRegisterCustomer.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
        buttonRegisterCustomer.addActionListener(this);
        add(buttonRegisterCustomer);
        mult++;

        buttonUpdateCustomer = new JButton("Atualizar Cliente");
        buttonUpdateCustomer.setBackground(Color.LIGHT_GRAY);
        buttonUpdateCustomer.setForeground(Color.BLACK);
        buttonUpdateCustomer.setFont(FONT);
        buttonUpdateCustomer.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
        buttonUpdateCustomer.addActionListener(this);
        add(buttonUpdateCustomer);
        mult++;

        // Listers
        buttonListProducts = new JButton("Listar Produtos");
        buttonListProducts.setBackground(Color.LIGHT_GRAY);
        buttonListProducts.setForeground(Color.BLACK);
        buttonListProducts.setFont(FONT);
        buttonListProducts.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
        buttonListProducts.addActionListener(this);
        add(buttonListProducts);
        mult++;

        buttonListSellers = new JButton("Listar Vendedores");
        buttonListSellers.setBackground(Color.LIGHT_GRAY);
        buttonListSellers.setForeground(Color.BLACK);
        buttonListSellers.setFont(FONT);
        buttonListSellers.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
        buttonListSellers.addActionListener(this);
        add(buttonListSellers);
        mult++;

        buttonListCustomers = new JButton("Listar Clientes");
        buttonListCustomers.setBackground(Color.LIGHT_GRAY);
        buttonListCustomers.setForeground(Color.BLACK);
        buttonListCustomers.setFont(FONT);
        buttonListCustomers.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
        buttonListCustomers.addActionListener(this);
        add(buttonListCustomers);
        mult++;
        // ------------------------------------------------------------------------------//

        // Home
        buttonHome = new JButton("Tela Inicial");
        buttonHome.setBackground(Color.LIGHT_GRAY);
        buttonHome.setForeground(Color.BLACK);
        buttonHome.setFont(FONT);
        buttonHome.setBounds(350, standartPos + spacer * mult, 120, 31);
        buttonHome.addActionListener(this);
        add(buttonHome);

        // Background
        JLabel labelBackground = new JLabel("");
        labelBackground.setBounds(0, 0, 830, 522);
        labelBackground.setIcon(new ImageIcon(SellerMenu.class.getResource("/vision/images/libraryBack.png")));
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

    public JButton getButtonRegisterSale() {
        return buttonRegisterSale;
    }

    public JButton getButtonRegisterCustomer() {
        return buttonRegisterCustomer;
    }

    public JButton getButtonUpdateCustomer() {
        return buttonUpdateCustomer;
    }

    public JButton getButtonListProducts() {
        return buttonListProducts;
    }

    public JButton getButtonListSellers() {
        return buttonListSellers;
    }

    public JButton getButtonListCustomers() {
        return buttonListCustomers;
    }

    public JButton getButtonHome() {
        return buttonHome;
    }

    public SellerMenuControl getController() {
        return controller;
    }
}
