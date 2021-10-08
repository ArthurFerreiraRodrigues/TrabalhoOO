package vision.menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.StoreManagerMenuControl;
import model.StoreManager;

import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 */
public class StoreManagerMenu extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private JButton buttonLogin;

    private JButton buttonRegisterProduct;
    private JButton buttonRegisterSeller;

    private JButton buttonUpdateProduct;
    private JButton buttonUpdateSeller;
    private JButton buttonUpdateStoreManager;

    private JButton buttonDeleteProduct;
    private JButton buttonDeleteSeller;
    private JButton buttonDeleteCustomer;

    private JButton buttonListProducts;
    private JButton buttonListSellers;
    private JButton buttonListCustomers;

    private final JButton buttonHome;

    private final StoreManagerMenuControl controller;

    public StoreManagerMenu() {
        int standartPos = 80, spacer = 50, mult = 0;
        controller = new StoreManagerMenuControl(this);

        // Verify Login
        StoreManager manager = StoreManager.isLogged();

        setBounds(100, 100, 830, 522);
        setLayout(null);

        JLabel labelTitle = new JLabel("Área do Gerente de Loja");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(145, 5, 800, 800);
        add(labelTitle);

        if (manager != null) {
            buttonLogin = new JButton("Realizar Login");
            buttonLogin.setBackground(Color.LIGHT_GRAY);
            buttonLogin.setForeground(Color.BLACK);
            buttonLogin.setFont(FONT);
            buttonLogin.setBounds(280, standartPos + spacer * mult, 267, 31);
            buttonLogin.addActionListener(this);
            add(buttonLogin);
            mult++;

            buttonHome = new JButton("Tela Inicial");
            buttonHome.setBackground(Color.LIGHT_GRAY);
            buttonHome.setForeground(Color.BLACK);
            buttonHome.setFont(FONT);
            buttonHome.setBounds(350, standartPos + spacer * mult, 120, 31);
            buttonHome.addActionListener(this);
            add(buttonHome);

            JLabel labelBackground = new JLabel("");
            labelBackground.setBounds(0, 0, 830, 522);
            labelBackground
                    .setIcon(new ImageIcon(StoreManagerMenu.class.getResource("/vision/images/libraryBack.png")));
            add(labelBackground);

        } else {
            int x_pos = 100;
            // Registers
            buttonRegisterProduct = new JButton("Registrar Produto");
            buttonRegisterProduct.setBackground(Color.LIGHT_GRAY);
            buttonRegisterProduct.setForeground(Color.BLACK);
            buttonRegisterProduct.setFont(FONT);
            buttonRegisterProduct.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonRegisterProduct.addActionListener(this);
            add(buttonRegisterProduct);
            mult++;

            buttonRegisterSeller = new JButton("Registrar Vendedor");
            buttonRegisterSeller.setBackground(Color.LIGHT_GRAY);
            buttonRegisterSeller.setForeground(Color.BLACK);
            buttonRegisterSeller.setFont(FONT);
            buttonRegisterSeller.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonRegisterSeller.addActionListener(this);
            add(buttonRegisterSeller);
            mult++;
            // ------------------------------------------------------------------------------//

            // Updaters
            buttonUpdateProduct = new JButton("Atualizar Produto");
            buttonUpdateProduct.setBackground(Color.LIGHT_GRAY);
            buttonUpdateProduct.setForeground(Color.BLACK);
            buttonUpdateProduct.setFont(FONT);
            buttonUpdateProduct.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonUpdateProduct.addActionListener(this);
            add(buttonUpdateProduct);
            mult++;

            buttonUpdateSeller = new JButton("Atualizar Vendedor");
            buttonUpdateSeller.setBackground(Color.LIGHT_GRAY);
            buttonUpdateSeller.setForeground(Color.BLACK);
            buttonUpdateSeller.setFont(FONT);
            buttonUpdateSeller.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonUpdateSeller.addActionListener(this);
            add(buttonUpdateSeller);
            mult++;

            buttonUpdateStoreManager = new JButton("Atualizar Gerente de Loja");
            buttonUpdateStoreManager.setBackground(Color.LIGHT_GRAY);
            buttonUpdateStoreManager.setForeground(Color.BLACK);
            buttonUpdateStoreManager.setFont(FONT);
            buttonUpdateStoreManager.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonUpdateStoreManager.addActionListener(this);
            add(buttonUpdateStoreManager);
            mult = 0; // End Collumn
            // ------------------------------------------------------------------------------//
            x_pos = 450; // Set x position of second collumn
            // Deleters
            buttonDeleteProduct = new JButton("Deletar Produto");
            buttonDeleteProduct.setBackground(Color.LIGHT_GRAY);
            buttonDeleteProduct.setForeground(Color.BLACK);
            buttonDeleteProduct.setFont(FONT);
            buttonDeleteProduct.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonDeleteProduct.addActionListener(this);
            add(buttonDeleteProduct);
            mult++;

            buttonDeleteSeller = new JButton("Deletar Vendedor");
            buttonDeleteSeller.setBackground(Color.LIGHT_GRAY);
            buttonDeleteSeller.setForeground(Color.BLACK);
            buttonDeleteSeller.setFont(FONT);
            buttonDeleteSeller.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonDeleteSeller.addActionListener(this);
            add(buttonDeleteSeller);
            mult++;

            buttonDeleteCustomer = new JButton("Deletar Cliente");
            buttonDeleteCustomer.setBackground(Color.LIGHT_GRAY);
            buttonDeleteCustomer.setForeground(Color.BLACK);
            buttonDeleteCustomer.setFont(FONT);
            buttonDeleteCustomer.setBounds(x_pos, standartPos + spacer * mult, 267, 31);
            buttonDeleteCustomer.addActionListener(this);
            add(buttonDeleteCustomer);
            mult++;
            // ------------------------------------------------------------------------------//

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
            labelBackground
                    .setIcon(new ImageIcon(StoreManagerMenu.class.getResource("/vision/images/libraryBack.png")));
            add(labelBackground);

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.execute(e.getSource());

    }

    public JButton getButtonLogin() {
        return buttonLogin;
    }

    public JButton getButtonRegisterProduct() {
        return buttonRegisterProduct;
    }

    public JButton getButtonRegisterSeller() {
        return buttonRegisterSeller;
    }

    public JButton getButtonUpdateProduct() {
        return buttonUpdateProduct;
    }

    public JButton getButtonUpdateSeller() {
        return buttonUpdateSeller;
    }

    public JButton getButtonUpdateStoreManager() {
        return buttonUpdateStoreManager;
    }

    public JButton getButtonDeleteProduct() {
        return buttonDeleteProduct;
    }

    public JButton getButtonDeleteSeller() {
        return buttonDeleteSeller;
    }

    public JButton getButtonDeleteCustomer() {
        return buttonDeleteCustomer;
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

    public StoreManagerMenuControl getController() {
        return controller;
    }

}
