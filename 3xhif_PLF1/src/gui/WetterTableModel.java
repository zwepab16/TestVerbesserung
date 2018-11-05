
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class WetterTableModel extends AbstractTableModel{
private ArrayList<Wetterstation> list=new ArrayList<>();
  private String[] überschriften={"Place","Sea Level","Temperature","rel. Humidity"};
    @Override
    public int getRowCount() {
      return list.size();
    }
    public String getColumnName(int i){
    return überschriften[i];
}

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void add(Wetterstation w){
        list.add(w);
        fireTableDataChanged();
    }

}
