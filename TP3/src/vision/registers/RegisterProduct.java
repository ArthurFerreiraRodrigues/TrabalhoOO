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

import java.awt.Font;
import javax.swing.SwingConstants;

import control.RegisterProductControl;

/**
 * Menu option class for StoreManagerMenu - RegisterProduct
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JPanel
 * @see java.awt.event.ActionListener
 * 
 * @see vision.menu.StoreManagerMenu
 */
public class RegisterProduct extends JPanel implements ActionListener {
    private static final Font FONT = new Font("Default", Font.BOLD, 16);

    private final JButton buttonHome;
    private final JButton buttonRegister;

    private final RegisterProductControl controller;

    private final JComboBox<Object> selector;

    // Product
    private final JTextField fieldId;
    private final JTextField fieldPrice;
    private final JTextField fieldInStockQuant;

    // Book
    private final JTextField fieldAuthor;
    private final JTextField fieldTitle;
    private final JTextField fieldType;
    private final JTextField fieldGenre;

    // Miscellaneous

    /**
     * 
     * @see model.Customer
     * @see model.Data
     */
    public RegisterProduct() {
        int standartPos = 80, spacer = 50, mult = 0, x_pos = 120, x_pos_base = 260;
        controller = new RegisterProductControl(this);

        setBounds(100, 100, 830, 522);
        setLayout(null);

        JLabel labelTitle = new JLabel("Registrar Produto");
        labelTitle.setVerticalAlignment(SwingConstants.TOP);
        labelTitle.setForeground(Color.GRAY);
        labelTitle.setFont(new Font("Default", Font.BOLD, 45));
        labelTitle.setBounds(220, 5, 800, 800);
        add(labelTitle);

        Object[] types = { "Livro", "Variados" };
        selector = new JComboBox<>(types);
        selector.setBackground(Color.LIGHT_GRAY);
        selector.setForeground(Color.BLACK);
        selector.setFont(FONT);
        selector.setBounds(540, standartPos + spacer * 0, 120, 31);
        selector.addActionListener(this);
        add(selector);

        // Product
        fieldId = new JTextField();
        JLabel labelId = new JLabel("Id: ");
        labelId.setFont(FONT);
        labelId.setForeground(Color.WHITE);
        labelId.setHorizontalAlignment(SwingConstants.CENTER);
        labelId.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelId.setLabelFor(fieldId);
        add(labelId);
        fieldId.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldId);
        mult++;

        fieldPrice = new JTextField();
        JLabel labelPrice = new JLabel("Preco : ");
        labelPrice.setFont(FONT);
        labelPrice.setForeground(Color.WHITE);
        labelPrice.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrice.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelPrice.setLabelFor(fieldPrice);
        add(labelPrice);
        fieldPrice.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldPrice);
        mult++;

        fieldInStockQuant = new JTextField();
        JLabel labelInStockQuant = new JLabel("Estoque : ");
        labelInStockQuant.setFont(FONT);
        labelInStockQuant.setForeground(Color.WHITE);
        labelInStockQuant.setHorizontalAlignment(SwingConstants.CENTER);
        labelInStockQuant.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelInStockQuant.setLabelFor(fieldInStockQuant);
        add(labelInStockQuant);
        fieldInStockQuant.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldInStockQuant);
        mult++;

        fieldAuthor = new JTextField();
        JLabel labelAuthor = new JLabel("Autor : ");
        labelAuthor.setFont(FONT);
        labelAuthor.setForeground(Color.WHITE);
        labelAuthor.setHorizontalAlignment(SwingConstants.CENTER);
        labelAuthor.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelAuthor.setLabelFor(fieldAuthor);
        add(labelAuthor);
        fieldAuthor.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldAuthor);
        mult++;

        fieldTitle = new JTextField();
        JLabel labelBookTitle = new JLabel("Titulo :");
        labelBookTitle.setFont(FONT);
        labelBookTitle.setForeground(Color.WHITE);
        labelBookTitle.setHorizontalAlignment(SwingConstants.CENTER);
        labelBookTitle.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelBookTitle.setLabelFor(fieldTitle);
        add(labelBookTitle);
        fieldTitle.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldTitle);
        mult++;

        fieldType = new JTextField();
        JLabel labelType = new JLabel("Tipo :");
        labelType.setFont(FONT);
        labelType.setForeground(Color.WHITE);
        labelType.setHorizontalAlignment(SwingConstants.CENTER);
        labelType.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelType.setLabelFor(fieldType);
        add(labelType);
        fieldType.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldType);
        mult++;

        fieldGenre = new JTextField();
        JLabel labelGenre = new JLabel("Genero :");
        labelGenre.setFont(FONT);
        labelGenre.setForeground(Color.WHITE);
        labelGenre.setHorizontalAlignment(SwingConstants.CENTER);
        labelGenre.setBounds(x_pos + 50, standartPos + spacer * mult, 175, 13);
        labelGenre.setLabelFor(fieldGenre);
        add(labelGenre);
        fieldGenre.setBounds(x_pos + 205, standartPos + spacer * mult, 147, 30);
        add(fieldGenre);
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

    public RegisterProductControl getController() {
        return controller;
    }

    public JComboBox<Object> getSelector() {
        return selector;
    }

    public JTextField getFieldId() {
        return fieldId;
    }

    public JTextField getFieldPrice() {
        return fieldPrice;
    }

    public JTextField getFieldInStockQuant() {
        return fieldInStockQuant;
    }

    public JTextField getFieldAuthor() {
        return fieldAuthor;
    }

    public JTextField getFieldTitle() {
        return fieldTitle;
    }

    public JTextField getFieldType() {
        return fieldType;
    }

    public JTextField getFieldGenre() {
        return fieldGenre;
    }
}
