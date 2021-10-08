package vision.deleters;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.DeleteSellerControl;
import model.Data;
import vision.table.Sellers;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * ContentPanel class : StoreManagerOption DeleteSeller
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 */
public class DeleteSeller extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private final JTable table;
    private JScrollPane scroll;
    private final String[] header = { "  ", "ID Vendedor", "Nome Vendedor", "Fluxo de Caixa", "Qtd.Unidades Vendidas" };
    private final JButton buttonHome;
    private final JButton buttonDelete;

    private final DeleteSellerControl controller;

    /**
     * Add a Table, a button to delete and a button do go back to the menu.
     */
    public DeleteSeller() {
        int standartPos = 80, spacer = 50;
        controller = new DeleteSellerControl(this);

        JPanel panel = new JPanel();

        panel.setBounds(100, 100, 830, 522);
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("Deletar Vendedores");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(150, 5, 800, 800);
        add(labelTitle);

        table = new JTable(Sellers.genTable(Sellers.toArrayList(Data.getSellers().toArray()), header, false));
        table.setSelectionMode(0);
        scroll = new JScrollPane();
        scroll.setViewportView(table);
        add(scroll);

        buttonDelete = new JButton("Deletar Selecionado");
        buttonDelete.setBackground(Color.LIGHT_GRAY);
        buttonDelete.setForeground(Color.BLACK);
        buttonDelete.setFont(FONT);
        buttonDelete.setBounds(340, standartPos + spacer * 0, 120, 31);
        buttonDelete.addActionListener(this);
        add(buttonDelete);

        buttonHome = new JButton("Tela Inicial");
        buttonHome.setBackground(Color.LIGHT_GRAY);
        buttonHome.setForeground(Color.BLACK);
        buttonHome.setFont(FONT);
        buttonHome.setBounds(340, standartPos + spacer * 1, 120, 31);
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
        return Sellers.genTable(Sellers.toArrayList(Data.getSellers().toArray()), header, isEditable);
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

    public JScrollPane getScroll() {
        return scroll;
    }

    public JButton getButtonDelete() {
        return buttonDelete;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JButton getButtonHome() {
        return buttonHome;
    }

    public DeleteSellerControl getController() {
        return controller;
    }

    public String[] getHeader() {
        return header;
    }

    public JTable getTable() {
        return table;
    }

}
