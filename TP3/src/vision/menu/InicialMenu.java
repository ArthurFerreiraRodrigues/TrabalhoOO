package vision.menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.InicialMenuControl;

import java.awt.Font;
import javax.swing.SwingConstants;

public class InicialMenu extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private final JButton buttonSpaceStoreManager;
    private final JButton buttonSpaceSeller;
    private final JButton buttonListSales;

    private final JButton buttonListProducts;
    private final JButton buttonListSellers;
    private final JButton buttonListCustomers;

    private final InicialMenuControl controller;

    public InicialMenu() {
        int standartPos = 80, spacer = 50;
        controller = new InicialMenuControl(this);

        setBounds(100, 100, 830, 522);
        setLayout(null);

        JLabel labelMenu = new JLabel("Menu Inicial");
        labelMenu.setVerticalAlignment(SwingConstants.TOP);
        labelMenu.setForeground(Color.GRAY);
        labelMenu.setFont(new Font("Default", Font.BOLD, 45));
        labelMenu.setBounds(285, 5, 500, 500);
        add(labelMenu);

        buttonSpaceStoreManager = new JButton("Área do Gerente de Loja");
        // buttonSpaceStoreManager.setEnabled(false);
        buttonSpaceStoreManager.setBackground(Color.LIGHT_GRAY);
        buttonSpaceStoreManager.setForeground(Color.BLACK);
        buttonSpaceStoreManager.setFont(FONT);
        buttonSpaceStoreManager.setBounds(280, standartPos + spacer * 0, 267, 31);
        buttonSpaceStoreManager.addActionListener(this);
        add(buttonSpaceStoreManager);

        buttonSpaceSeller = new JButton("Área do Vendedor");
        // buttonSpaceSeller.setEnabled(false);
        buttonSpaceSeller.setBackground(Color.LIGHT_GRAY);
        buttonSpaceSeller.setForeground(Color.BLACK);
        buttonSpaceSeller.setFont(FONT);
        buttonSpaceSeller.setBounds(280, standartPos + spacer * 1, 267, 31);
        buttonSpaceSeller.addActionListener(this);
        add(buttonSpaceSeller);

        buttonListSales = new JButton("Listar Vendas Realiazadas");
        // buttonListSales.setEnabled(false);
        buttonListSales.setBackground(Color.LIGHT_GRAY);
        buttonListSales.setForeground(Color.BLACK);
        buttonListSales.setFont(FONT);
        buttonListSales.setBounds(280, standartPos + spacer * 2, 267, 31);
        buttonListSales.addActionListener(this);
        add(buttonListSales);

        buttonListProducts = new JButton("Listar Produtos");
        buttonListProducts.setBackground(Color.LIGHT_GRAY);
        buttonListProducts.setForeground(Color.BLACK);
        buttonListProducts.setFont(FONT);
        buttonListProducts.setBounds(280, standartPos + spacer * 3, 267, 31);
        buttonListProducts.addActionListener(this);
        add(buttonListProducts);

        buttonListSellers = new JButton("Listar Clientes");
        buttonListSellers.setBackground(Color.LIGHT_GRAY);
        buttonListSellers.setForeground(Color.BLACK);
        buttonListSellers.setFont(FONT);
        buttonListSellers.setBounds(280, standartPos + spacer * 4, 267, 31);
        buttonListSellers.addActionListener(this);
        add(buttonListSellers);

        buttonListCustomers = new JButton("Listar Vendedores");
        buttonListCustomers.setBackground(Color.LIGHT_GRAY);
        buttonListCustomers.setForeground(Color.BLACK);
        buttonListCustomers.setFont(FONT);
        buttonListCustomers.setBounds(280, standartPos + spacer * 5, 267, 31);
        buttonListCustomers.addActionListener(this);
        add(buttonListCustomers);

        JLabel labelBackground = new JLabel("");
        labelBackground.setBounds(0, 0, 830, 522);
        labelBackground.setIcon(new ImageIcon(InicialMenu.class.getResource("/vision/images/libraryBack.png")));
        add(labelBackground);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.execute(e.getSource());

    }

    public JButton getButtonSpaceStoreManager() {
        return buttonSpaceStoreManager;
    }

    public JButton getButtonSpaceSeller() {
        return buttonSpaceSeller;
    }

    public JButton getButtonListSales() {
        return buttonListSales;
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

    public InicialMenuControl getController() {
        return controller;
    }
}