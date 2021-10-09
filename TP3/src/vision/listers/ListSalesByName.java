package vision.listers;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import control.ListSalesByNameControl;
import model.Data;
import vision.table.Sales;

/**
 * Menu option class for ListSalesMenu - ListSalesByName.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 */
public class ListSalesByName extends JPanel implements ActionListener {

    private static final Font FONT = new Font("Default", Font.PLAIN, 16);
    private static final String[] header = { "  ", "ID Vendedor", "Nome Vendedor", "Cliente", "Qtd.Unidades",
            "Total (R$)" };

    private Object[] arraySellers = Data.getSellersInfo(Data.getSellers(), 1);

    private JComboBox<Object> selector = new JComboBox<>(arraySellers);
    private JScrollPane scroll;

    private final JButton buttonHome;

    private final ListSalesByNameControl controller;

    /**
     * Adds a Table, a JComboBox with all Sellers Names and a button do go back to
     * the main menu.
     * 
     * @see javax.swing.JComboBox
     * @see vision.table.Sales
     */
    public ListSalesByName() {
        int standartPos = 80, spacer = 50;
        controller = new ListSalesByNameControl(this);

        JPanel panel = new JPanel();

        panel.setBounds(100, 100, 830, 522);
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("Listar Vendas por Nome");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(150, 5, 800, 800);
        add(labelTitle);

        selector.addActionListener(this);
        selector.setBackground(Color.LIGHT_GRAY);
        selector.setForeground(Color.BLACK);
        selector.setFont(FONT);
        selector.setBounds(340, standartPos + spacer * 0, 120, 31);
        add(selector);

        scroll = new JScrollPane();
        add(scroll);

        buttonHome = new JButton("Tela Inicial");
        buttonHome.setBackground(Color.LIGHT_GRAY);
        buttonHome.setForeground(Color.BLACK);
        buttonHome.setFont(FONT);
        buttonHome.setBounds(340, standartPos + spacer * 3, 120, 31);
        buttonHome.addActionListener(this);
        add(buttonHome);

    }

    /**
     * Generates a new DefaultTableModel.
     * 
     * @param header
     * @param isEditable
     * @return TableModel
     */
    public JTable scrollViewportView(int index, String[] header) {
        return Sales.genTableAll(Sales.toArrayList(Data.getSellers().get(index).getSales(Data.getSales()).toArray()),
                header);
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

    public String[] getHeader() {
        return header;
    }

    public JComboBox<Object> getSelector() {
        return selector;
    }

    public ListSalesByNameControl getController() {
        return controller;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public JButton getButtonHome() {
        return buttonHome;
    }

}