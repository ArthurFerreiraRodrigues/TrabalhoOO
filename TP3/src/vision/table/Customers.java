package vision.table;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Customer;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 */
public class Customers {

    private String pos;
    private String name;
    private String adress;
    private String celNumber;
    private String timesInStore;

    public Customers(int pos, String name, String adress, String celNumber, int timesInStore) {
        this.pos = Integer.toString(pos);
        this.name = name;
        this.adress = adress;
        this.celNumber = celNumber;
        this.timesInStore = Integer.toString(timesInStore);
    }

    public static ArrayList<Customers> toArrayList(Object[] sellers) {
        ArrayList<Customers> customerData = new ArrayList<Customers>();

        int i = 1;
        for (Object customer : sellers) {
            customerData.add(new Customers(i, ((Customer) customer).getName(), ((Customer) customer).getAdress(),
                    ((Customer) customer).getCelNumber(), ((Customer) customer).getTimesInStore()));
            i++;
        }

        return customerData;
    }

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
                    customerData.get(i).getAdress(), customerData.get(i).getCelNumber(),
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
