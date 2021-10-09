package vision.table;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Sale;

/**
 * Contains helper functions to create a JTable
 * 
 * @author ArthuFerreiraRodrigues <a href="
 *         #{@link}">{@link https://github.com/ArthurFerreiraRodrigues/TrabalhoOO}</a>
 */
public class Sales {

    private Sale sale;
    private String pos;
    private String sellerId;
    private String sellerName;
    private String buyerName;
    private String unitsSold;
    private String subTotal;

    /**
     * 
     * @param pos        - int
     * @param sellerId   - int
     * @param sellerName - String
     * @param buyerName  - String
     * @param unitsSold  - int
     * @param subTotal   - double
     */
    public Sales(int pos, int sellerId, String sellerName, String buyerName, int unitsSold, double subTotal) {
        this.pos = Integer.toString(pos);
        this.sellerId = Integer.toString(sellerId);
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        this.unitsSold = (Integer.toString(unitsSold));
        this.subTotal = Double.toString(subTotal);
    }

    /**
     * Receives a colection of Object and transforms it to ArrayList
     * 
     * @param sellers - Object[]
     * @return customerData - ArrayList
     */
    public static ArrayList<Sales> toArrayList(Object[] sales) {
        ArrayList<Sales> salesData = new ArrayList<Sales>();

        int i = 1;
        for (Object sale : sales) {
            salesData.add(new Sales(i, ((Sale) sale).getSeller().getId(), ((Sale) sale).getSeller().getName(),
                    ((Sale) sale).getBuyer().getName(), ((Sale) sale).getUnitsSold(), ((Sale) sale).getSubTotal()));
            i++;
        }
        return salesData;
    }

    /**
     * Generates a DefaultTableModel
     * 
     * @param customerData - ArrayList
     * @param header       - Object[]
     * @param isEditable   - Boolean
     * @return tableModel - DefaultTableModel
     */
    public static JTable genTableAll(ArrayList<Sales> salesData, Object[] header) {

        DefaultTableModel tableModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (int i = 0; i < salesData.size(); i++) {
            Object[] data = { salesData.get(i).getPos(), salesData.get(i).getSellerId(),
                    salesData.get(i).getSellerName(), salesData.get(i).getBuyerName(), salesData.get(i).getUnitsSold(),
                    salesData.get(i).getSubTotal() };
            tableModel.addRow(data);
        }

        return new JTable(tableModel);
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(String unitsSold) {
        this.unitsSold = unitsSold;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

}
