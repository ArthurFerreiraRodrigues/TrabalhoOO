package vision.table;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Product;
import products.*;

/**
 * Contains helper functions to create a JTable
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 * 
 */
public class Products {
    private String pos;
    private String id;
    private String type;
    private String price;
    private String inStockQuant;
    private String auth_brand;
    private String title_name;

    public Products(int pos, int id, String type, double price, int inStockQuant, String auth_brand,
            String title_name) {

        this.pos = Integer.toString(pos);
        this.id = Integer.toString(id);
        this.type = type;
        this.price = Double.toString(price);
        this.inStockQuant = Integer.toString(inStockQuant);
        this.auth_brand = auth_brand;
        this.title_name = title_name;
    }

    /**
     * Receives a colection of Object and transforms it to ArrayList
     * 
     * @param sellers - Object[]
     * @return customerData - ArrayList
     */
    public static ArrayList<Products> toArrayList(Object[] products) {
        ArrayList<Products> productData = new ArrayList<Products>();

        int i = 1;
        for (Object product : products) {
            if (product instanceof Book) {
                productData.add(new Products(i, ((Product) product).getId(), "Livro", ((Product) product).getPrice(),
                        ((Product) product).getInStockQuant(), ((Book) product).getAuthor(),
                        ((Book) product).getTitle()));
            } else {
                productData.add(new Products(i, ((Product) product).getId(), "Variado", ((Product) product).getPrice(),
                        ((Product) product).getInStockQuant(), ((Miscellaneous) product).getBrand(),
                        ((Miscellaneous) product).getName()));
            }
            i++;
        }

        return productData;
    }

    /**
     * Generates a DefaultTableModel
     * 
     * @param productData - ArrayList
     * @param header      - Object[]
     * @param isEditable  - Boolean
     * @return tableModel - DefaultTableModel
     */
    public static DefaultTableModel genTable(ArrayList<Products> productData, Object[] header, Boolean isEditable) {
        DefaultTableModel tableModel;

        if (isEditable) {
            tableModel = new DefaultTableModel(header, 0);
        } else {
            tableModel = new DefaultTableModel(header, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        }

        for (int i = 0; i < productData.size(); i++) {
            Object[] data = { productData.get(i).getPos(), productData.get(i).getId(), productData.get(i).getType(),
                    productData.get(i).getPrice(), productData.get(i).getInStockQuant(),
                    productData.get(i).getAuth_brand(), productData.get(i).getTitle_name() };
            tableModel.addRow(data);
        }

        return tableModel;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInStockQuant() {
        return inStockQuant;
    }

    public void setInStockQuant(String inStockQuant) {
        this.inStockQuant = inStockQuant;
    }

    public String getAuth_brand() {
        return auth_brand;
    }

    public void setAuth_brand(String auth_brand) {
        this.auth_brand = auth_brand;
    }

    public String getTitle_name() {
        return title_name;
    }

    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

}
