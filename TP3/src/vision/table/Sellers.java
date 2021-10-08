package vision.table;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Seller;

/**
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 */
public class Sellers {
    private String pos;
    private String id;
    private String name;
    private String cashFlow;
    private String unitsSold;

    public Sellers(int pos, int id, String name, double cashFlow, int unitsSold) {
        this.pos = Integer.toString(pos);
        this.id = Integer.toString(id);
        this.name = name;
        this.cashFlow = Double.toString(cashFlow);
        this.unitsSold = Integer.toString(unitsSold);
    }

    public static ArrayList<Sellers> toArrayList(Object[] sellers) {
        ArrayList<Sellers> sellerData = new ArrayList<Sellers>();

        int i = 1;
        for (Object seller : sellers) {
            sellerData.add(new Sellers(i, ((Seller) seller).getId(), ((Seller) seller).getName(),
                    ((Seller) seller).getCashFlow(), ((Seller) seller).getUnitsSold()));
            i++;
        }

        return sellerData;
    }

    public static DefaultTableModel genTable(ArrayList<Sellers> sellerData, Object[] header, Boolean isEditable) {
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

        for (int i = 0; i < sellerData.size(); i++) {
            Object[] data = { sellerData.get(i).getPos(), sellerData.get(i).getId(), sellerData.get(i).getName(),
                    sellerData.get(i).getCashFlow(), sellerData.get(i).getUnitsSold() };
            tableModel.addRow(data);
        }
        return tableModel;
    }

    // salve edu
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(String cashFlow) {
        this.cashFlow = cashFlow;
    }

    public String getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(String unitsSold) {
        this.unitsSold = unitsSold;
    }

}
