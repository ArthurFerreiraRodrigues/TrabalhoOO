package vision.menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import control.ListSalesMenuControl;

/**
 * Class with all list sales menu options.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 */
public class ListSalesMenu extends JPanel implements ActionListener {

    private static final Font FONT = new Font("Default", Font.PLAIN, 16);

    private final JButton buttonListAll;
    private final JButton buttonListSalesById;
    private final JButton buttonListSalesByName;
    private final JButton buttonHome;

    private final ListSalesMenuControl controller;

    /**
     * Adds 3 menu options and a home button.
     * 
     * @see vision.table.Sales
     * @see vision.listers.ListAllSales
     * @see vision.listers.ListSalesById
     * @see vision.listers.ListSalesByName
     */
    public ListSalesMenu() {
        int standartPos = 80, spacer = 50;
        controller = new ListSalesMenuControl(this);

        setBounds(100, 100, 830, 522);
        setLayout(null);

        JLabel labelTitle = new JLabel("Listar Vendas Realizadas");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(145, 5, 800, 800);
        add(labelTitle);

        buttonListAll = new JButton("Todas as Vendas Feitas");
        buttonListAll.setBackground(Color.LIGHT_GRAY);
        buttonListAll.setForeground(Color.BLACK);
        buttonListAll.setFont(FONT);
        buttonListAll.setBounds(257, standartPos + spacer * 0, 290, 31);
        buttonListAll.addActionListener(this);
        add(buttonListAll);

        buttonListSalesById = new JButton("Vendas Feitas por Vendedor (ID)");
        buttonListSalesById.setBackground(Color.LIGHT_GRAY);
        buttonListSalesById.setForeground(Color.BLACK);
        buttonListSalesById.setFont(FONT);
        buttonListSalesById.setBounds(257, standartPos + spacer * 1, 290, 31);
        buttonListSalesById.addActionListener(this);
        add(buttonListSalesById);

        buttonListSalesByName = new JButton("Vendas Feitas por Vendedor (Nome)");
        buttonListSalesByName.setBackground(Color.LIGHT_GRAY);
        buttonListSalesByName.setForeground(Color.BLACK);
        buttonListSalesByName.setFont(FONT);
        buttonListSalesByName.setBounds(257, standartPos + spacer * 2, 290, 31);
        buttonListSalesByName.addActionListener(this);
        add(buttonListSalesByName);

        buttonHome = new JButton("Tela Inicial");
        buttonHome.setBackground(Color.LIGHT_GRAY);
        buttonHome.setForeground(Color.BLACK);
        buttonHome.setFont(FONT);
        buttonHome.setBounds(340, standartPos + spacer * 3, 120, 31);
        buttonHome.addActionListener(this);
        add(buttonHome);

        JLabel labelBackground = new JLabel("");
        labelBackground.setBounds(0, 0, 830, 522);
        labelBackground.setIcon(new ImageIcon(ListSalesMenu.class.getResource("/vision/images/libraryBack.png")));
        add(labelBackground);
    }

    public JButton getButtonListAll() {
        return buttonListAll;
    }

    public JButton getButtonListSalesById() {
        return buttonListSalesById;
    }

    public JButton getButtonListSalesByName() {
        return buttonListSalesByName;
    }

    public JButton getButtonHome() {
        return buttonHome;
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
}
