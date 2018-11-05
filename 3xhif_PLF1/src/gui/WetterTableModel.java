
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
      return list.get(i);
    }
    public void add(Wetterstation w){
        list.add(w);
        fireTableDataChanged();
    }

}
