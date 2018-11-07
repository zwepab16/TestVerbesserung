
package gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(list,new SortName());
        fireTableDataChanged();
    }
public void löschen(int[] zeilen){
     int count = 0;
        for (int i : zeilen) {
        list.remove(i - count);
        count++;

        }

        fireTableDataChanged();

}
public void setTemp(int z,double temp) throws Exception{
    list.get(z).setTemp(temp);
            fireTableDataChanged();
            }
public void setHuman(int z,int hum) throws Exception{
    list.get(z).setHumidity(hum); 
     fireTableDataChanged();
}
public void save() throws Exception{
    
    File f=new File(".\\daten.ser");
    FileOutputStream fos=new FileOutputStream(f);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(list);
    oos.flush();
    fos.close();
       fireTableDataChanged();
}
public void laden() throws Exception{
    
    File f=new File(".\\daten.ser");
    FileInputStream fis=new FileInputStream(f);
    ObjectInputStream ois=new ObjectInputStream(fis);
    list=(ArrayList<Wetterstation>)ois.readObject();
   fis.close();
   fireTableDataChanged();
}

}
