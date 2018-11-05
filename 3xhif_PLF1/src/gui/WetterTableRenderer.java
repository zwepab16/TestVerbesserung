
package gui;

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
        return label;
    }

}
