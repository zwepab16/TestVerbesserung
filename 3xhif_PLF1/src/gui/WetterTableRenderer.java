
package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class WetterTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
       JLabel label = new JLabel();
        Wetterstation w = (Wetterstation) o;
        switch (i1) {
            case 0:
                label.setText("" + w.getPlace());
                break;
            case 1:
                label.setText( w.getSealevel()+"m");
                break;
            case 2:
                label.setText(String.format("%.1f°", w.getTemp()));
                
                break;
                 case 3:
                label.setText(w.getHumidity()+" %");
                break;
            default:
                label.setText("???");
        }
        if(bln){
            label.setBackground(Color.gray);
              
        }
        if(w.getTemp()>25&&w.getHumidity()<20)label.setBackground(Color.yellow);
        if(w.getTemp()<0&&w.getHumidity()<30)label.setBackground(Color.blue);
        if(w.getTemp()>0&&w.getTemp()<25&&w.getHumidity()>50)label.setBackground(Color.green);
        
         if(bln){
            label.setBackground(Color.gray);
              
        }
        label.setOpaque(true);
        return label;
    }

}
