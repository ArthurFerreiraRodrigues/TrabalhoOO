package vision.deleters;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.DeleteCustomerControl;
import model.Data;
import vision.table.Customers;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * ContentPanel class : StoreManagerOption DeleteCustomer
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 * 
 * @see vision.menu.StoreManagerMenu
 */
public class DeleteCustomer extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private JTable table;
    private JScrollPane scroll;
    private final String[] header = { "  ", "Nome", "Endereço", "Telefone", "Qtd.Visitas" };
    private final JButton buttonDelete;
    private final JButton buttonHome;

    private final DeleteCustomerControl controller;

    /**
     * Add a Table, a button to delete and a button do go back to the menu.
     */
    public DeleteCustomer() {
        int standartPos = 80, spacer = 50, mult = 0;
        controller = new DeleteCustomerControl(this);

        JPanel panel = new JPanel();

        panel.setBounds(100, 100, 830, 522);
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("Deletar Clientes");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(150, 5, 800, 800);
        add(labelTitle);

        table = new JTable(this.scrollViewportView(header, false));
        table.setSelectionMode(0);
        scroll = new JScrollPane();
        scroll.setViewportView(table);
        add(scroll);

        buttonDelete = new JButton("Deletar Selecionado");
        buttonDelete.setBackground(Color.LIGHT_GRAY);
        buttonDelete.setForeground(Color.BLACK);
        buttonDelete.setFont(FONT);
        buttonDelete.setBounds(340, standartPos + spacer * mult, 120, 31);
        buttonDelete.addActionListener(this);
        add(buttonDelete);
        mult++;

        buttonHome = new JButton("Voltar");
        buttonHome.setBackground(Color.LIGHT_GRAY);
        buttonHome.setForeground(Color.BLACK);
        buttonHome.setFont(FONT);
        buttonHome.setBounds(340, standartPos + spacer * mult, 120, 31);
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
    public DefaultTableModel scrollViewportView(String[] header, boolean isEditable) {
        return Customers.genTable(Customers.toArrayList(Data.getCustomers().toArray()), header, isEditable);
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

    public JTable getTable() {
        return table;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public JButton getButtonDelete() {
        return buttonDelete;
    }

    public JButton getButtonHome() {
        return buttonHome;
    }

    public String[] getHeader() {
        return header;
    }
}
