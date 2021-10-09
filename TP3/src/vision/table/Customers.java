package vision.table;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Customer;

/**
 * Contains helper functions to create a JTable
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 */
public class Customers {

    private String pos;
    private String name;
    private String address;
    private String celNumber;
    private String timesInStore;

    /**
     * 
     * @param pos          - int
     * @param name         - String
     * @param address      - String
     * @param celNumber    - String
     * @param timesInStore - int
     */
    public Customers(int pos, String name, String address, String celNumber, int timesInStore) {
        this.pos = Integer.toString(pos);
        this.name = name;
        this.address = address;
        this.celNumber = celNumber;
        this.timesInStore = Integer.toString(timesInStore);
    }

    /**
     * Receives a colection of Object and transforms it to ArrayList
     * 
     * @param sellers - Object[]
     * @return customerData - ArrayList
     */
    public static ArrayList<Customers> toArrayList(Object[] sellers) {
        ArrayList<Customers> customerData = new ArrayList<Customers>();

        int i = 1;
        for (Object customer : sellers) {
            customerData.add(new Customers(i, ((Customer) customer).getName(), ((Customer) customer).getAddress(),
                    ((Customer) customer).getCelNumber(), ((Customer) customer).getTimesInStore()));
            i++;
        }

        return customerData;
    }

    /**
     * Generates a DefaultTableModel
     * 
     * @param customerData - ArrayList
     * @param header       - Object[]
     * @param isEditable   - Boolean
     * @return tableModel - DefaultTableModel
     */
    public static DefaultTableModel genTable(ArrayList<Customers> customerData, Object[] header, Boolean isEditable) {
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

        for (int i = 0; i < customerData.size(); i++) {
            Object[] data = { customerData.get(i).getPos(), customerData.get(i).getName(),
                    customerData.get(i).getAddress(), customerData.get(i).getCelNumber(),
                    customerData.get(i).getTimesInStore() };
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(String celNumber) {
        this.celNumber = celNumber;
    }

    public String getTimesInStore() {
        return timesInStore;
    }

    public void setTimesInStore(String timesInStore) {
        this.timesInStore = timesInStore;
    }

}
