package main;

import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import vision.menu.*;
import vision.deleters.*;

import vision.listers.ListAllSales;
import vision.listers.ListCustomers;
import vision.listers.ListProducts;
import vision.listers.ListSalesById;
import vision.listers.ListSalesByName;
import vision.listers.ListSellers;
import util.Fill;

/**
 * Main Graphical Interface class.
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 * @see javax.swing.JFrame
 * @see javax.swing.event.AncestorListener
 */
public class MainFrame extends JFrame implements AncestorListener {

    private JPanel contentPane;
    private static Container cont;

    private InicialMenu inicialMenu;
    private StoreManagerMenu storeManagerMenu;
    private SellerMenu sellerMenu;
    private ListSalesMenu listSalesMenu;

    private DeleteProduct deleteProduct;
    private DeleteCustomer deleteCustomer;
    private DeleteSeller deleteSeller;

    private ListAllSales listAllSales;
    private ListSalesById listSalesById;
    private ListSalesByName listSalesByName;
    private ListProducts listProducts;
    private ListSellers listSellers;
    private ListCustomers listCustomers;
    private MainFrameControl controller;

    /**
     * Initialize the MainFrame and Fill the DataSet
     * 
     * @param args
     * @throws Exception
     * 
     * @see util.Fill
     */
    public static void main(String[] args) throws Exception {
        Fill.customer();
        Fill.productList();
        Fill.setStoreManager(); // Nome : Gerete | Username : Gerente | Senha : Gerente
        Fill.seller();
        Fill.sale();
        // main.menu.Switch.inicial();
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }

    /**
     * Main Graphical Interface
     */
    public MainFrame() {
        controller = new MainFrameControl(this);

        setTitle("T8.8 - Livraria");
        setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/vision/images/iconUnb.png")));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 850, 570);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout());

        // Menus
        inicialMenu = new InicialMenu();
        inicialMenu.addAncestorListener(this);

        storeManagerMenu = new StoreManagerMenu();
        storeManagerMenu.addAncestorListener(this);

        sellerMenu = new SellerMenu();
        sellerMenu.addAncestorListener(this);

        listSalesMenu = new ListSalesMenu();
        listSalesMenu.addAncestorListener(this);

        getContentPane().add(inicialMenu, "inicialMenu");
        getContentPane().add(storeManagerMenu, "storeManagerMenu");
        getContentPane().add(sellerMenu, "sellerMenu");
        getContentPane().add(listSalesMenu, "listSalesMenu");

        // ------------------------------------------------------------------------------//

        // StoreManagerMenu options

        deleteCustomer = new DeleteCustomer();
        deleteCustomer.addAncestorListener(this);

        deleteSeller = new DeleteSeller();
        deleteSeller.addAncestorListener(this);

        deleteProduct = new DeleteProduct();
        deleteProduct.addAncestorListener(this);

        getContentPane().add(deleteCustomer, "deleteCustomer");
        getContentPane().add(deleteSeller, "deleteSeller");
        getContentPane().add(deleteProduct, "deleteProduct");
        // ------------------------------------------------------------------------------//

        // Listers

        listAllSales = new ListAllSales();
        listAllSales.addAncestorListener(this);

        listSalesById = new ListSalesById();
        listSalesById.addAncestorListener(this);

        listSalesByName = new ListSalesByName();
        listSalesByName.addAncestorListener(this);

        listSellers = new ListSellers();
        listSellers.addAncestorListener(this);

        listProducts = new ListProducts();
        listProducts.addAncestorListener(this);

        listCustomers = new ListCustomers();
        listCustomers.addAncestorListener(this);

        getContentPane().add(listAllSales, "listAllSales");
        getContentPane().add(listSalesById, "listSalesById");
        getContentPane().add(listSalesByName, "listSalesByName");
        getContentPane().add(listSellers, "listSellers");
        getContentPane().add(listCustomers, "listCustomers");
        getContentPane().add(listProducts, "listProducts");

        // ------------------------------------------------------------------------------//

        // .addAncestorListener(this);

        cont = getContentPane();

    }

    /**
     * Refreshes the screen
     * 
     * @param
     */
    @Override
    public void ancestorAdded(AncestorEvent event) {
        controller.screenRefresh(event.getSource());
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // Vazio
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {

        // Vazio
    }

    public static Container getCont() {
        return cont;
    }

    public MainFrameControl getController() {
        return controller;
    }

    public InicialMenu getInicialMenu() {
        return inicialMenu;
    }

    public StoreManagerMenu getStoreManagerMenu() {
        return storeManagerMenu;
    }

    public SellerMenu getSellerMenu() {
        return sellerMenu;
    }

    public ListSalesMenu getListSalesMenu() {
        return listSalesMenu;
    }

    public ListAllSales getListAllSales() {
        return listAllSales;
    }

    public ListSalesById getListSalesById() {
        return listSalesById;
    }

    public ListSalesByName getListSalesByName() {
        return listSalesByName;
    }

}