package vision.deleters;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import control.DeleteProductControl;
import model.Data;
import vision.table.Products;

/**
 * ContentPanel class : StoreManagerOption DeleteProduct
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 */
public class DeleteProduct extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.PLAIN, 16);
    private static final String[] header = { "  ", "ID Produto", "Tipo do Produto", "Preço (R$)", "Estoque",
            " Autor/Marca", "Título/Nome" };

    private JTable table;
    private JScrollPane scroll;

    private final JButton buttonHome;
    private final JButton buttonDelete;

    private final DeleteProductControl controller;

    /**
     * Add a Table, a button to delete and a button do go back to the menu.
     */
    public DeleteProduct() {
        int standartPos = 80, spacer = 50;
        controller = new DeleteProductControl(this);

        JPanel panel = new JPanel();

        panel.setBounds(100, 100, 830, 522);
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("Deletar Produtos");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(150, 5, 800, 800);
        add(labelTitle);

        table = new JTable(Products.genTable(Products.toArrayList(Data.getProducts().toArray()), header, false));
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

        buttonHome = new JButton("Voltar");
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
        return Products.genTable(Products.toArrayList(Data.getProducts().toArray()), header, isEditable);
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

    public DeleteProductControl getController() {
        return controller;
    }

    public String[] getHeader() {
        return header;
    }

    public JTable getTable() {
        return table;
    }

}
